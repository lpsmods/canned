package dev.lpsmods.canned.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

/**
 * Author: legopitstop
 */
public class CanBlock extends Block implements SimpleWaterloggedBlock {
    public static final MapCodec<CanBlock> CODEC = simpleCodec(CanBlock::new);
    public static final int MAX_CANS = 8;
    public static final IntegerProperty CANS;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape SMALL_AABB;
    protected static final VoxelShape MEDIUM_AABB;
    protected static final VoxelShape LARGE_AABB;

    public MapCodec<CanBlock> codec() {
        return CODEC;
    }

    public CanBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(CANS, 1)).setValue(WATERLOGGED, true));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockState blockstate = pContext.getLevel().getBlockState(pContext.getClickedPos());
        if (blockstate.is(this)) {
            return (BlockState)blockstate.setValue(CANS, Math.min(8, (Integer)blockstate.getValue(CANS) + 1));
        } else {
            FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
            boolean flag = fluidstate.getType() == Fluids.WATER;
            return (BlockState)super.getStateForPlacement(pContext).setValue(WATERLOGGED, flag);
        }
    }

    protected boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        return !pUseContext.isSecondaryUseActive() && pUseContext.getItemInHand().is(this.asItem()) && (Integer)pState.getValue(CANS) < 8 ? true : super.canBeReplaced(pState, pUseContext);
    }

    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch ((Integer)pState.getValue(CANS)) {
            case 1:
            default: {
                return SMALL_AABB;
            }
            case 2,3,4: {
                return MEDIUM_AABB;
            }
            case 5,6,7,8: {
                return LARGE_AABB;
            }
        }
    }

    protected FluidState getFluidState(BlockState pState) {
        return (Boolean)pState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(pState);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(new Property[]{CANS, WATERLOGGED});
    }

    protected boolean isPathfindable(BlockState pState, PathComputationType pPathComputationType) {
        return false;
    }

    static {
        WATERLOGGED = BooleanProperty.create("waterlogged");
        CANS = IntegerProperty.create("cans", 1, 8);
        SMALL_AABB = Block.box(4,0,4, 12,9,12);
        MEDIUM_AABB = Block.box(0,0,0, 16, 8, 16);
        LARGE_AABB = Block.box(0,0,0, 16, 16, 16);
    }
}
