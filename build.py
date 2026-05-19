from mcaddon import *

class CanBlock(Block):
    def __init__(self, id):
        Block.__init__(self, id)
        self.add_trait(PlacementDirectionTrait.cardinal())
        self.cans = self.add_state(IntegerState('lpsm_canned:cans', 8, 1))

        self.add_component(LightDampeningComponent(0))
        self.add_component(DestructibleByExplosionComponent(0.5))
        self.add_component(DestructibleByMiningComponent(0.5))
        self.add_component(OnPlayerPlacingComponent())
        self.add_component(OnInteractComponent('increase_cans', Molang(f"q.is_item_name_any('slot.weapon.mainhand','{self.identifier}')&&q.block_state('{self.cans.id}')!=8")))
        mi = MaterialInstancesComponent()
        mi.add_material('*', Material(f'lpsm_canned:{self.identifier}', RenderMethod.ALPHA_TEST))
        self.add_component(mi)

        self.add_event('on_player_placing', SetBlockState({self.cans.id: "math.random_integer(2, 5)"}))

        self.add_event('increase_cans', DecrementStack())
        self.add_event('increase_cans', IncrementBlockState('lpsm_canned:cans'))
        self.add_event('increase_cans', RunCommand('playsound block.lantern.step @a[r=17] ~ ~ ~'))


items = ['apple']
for i in items:
    blk = CanBlock(f'lpsm_canned:{i}_can')
    blk.save(f'blocks/gen/{i}_can.json')
