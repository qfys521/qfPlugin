/*
 * Copyright (c) qfys521 2024.
 *
 * 本文件 `Items.java`使用版权 `AGPL-3.0`.
 * 适度编码益脑，沉迷编码伤身，合理安排时间，享受快乐生活。
 *
 * This file `Items.java` is licensed under the `AGPL-3.0` license.
 * Coding moderately is beneficial to the brain, but overindulgence in coding is harmful to the body. Arrange your time reasonably and enjoy a happy life.
 */

package cn.qfys521.qqbot.plugin.interactors.utils.minecraft.Entitys;

import cn.qfys521.qqbot.plugin.interactors.utils.minecraft.Blocks.Blocks;

import java.util.HashMap;

/**
 * 未来可能会实现set()，现在已咕咕咕 <br/>
 *
 * @author qfys521 <br/>
 * private String ItemName; <br/>
 * private String ItemChineseName; <br/>
 * <br/>
 * 注:未来请新添加get()和set()，此版本的get(Str)请保留作为向下兼容使用。 <br/>r
 */
public class Items {


    /**
     * getItemName()
     *
     * @param ItemChineseName Item中文名<br/>
     * @return ItemName或者null <br/>
     * @author qfys521
     */
    public String getItemName(String ItemChineseName) {
        Blocks b1 = new Blocks();
        HashMap<String, String> cte = new HashMap<>();

        cte.put("铁剑", "iron_sword");
        cte.put("铁锹", "iron_shovel");
        cte.put("铁镐", "iron_pickaxe");
        cte.put("铁斧", "iron_axe");
        cte.put("铁锄", "iron_hoe");
        cte.put("木剑", "wooden_sword");
        cte.put("木锹", "wooden_shovel");
        cte.put("木镐", "wooden_pickaxe");
        cte.put("木斧", "wooden_axe");
        cte.put("木锄", "wooden_hoe");
        cte.put("石剑", "stone_sword");
        cte.put("石锹", "stone_shovel");
        cte.put("石镐", "stone_pickaxe");
        cte.put("石斧", "stone_axe");
        cte.put("石锄", "stone_hoe");
        cte.put("钻石剑", "diamond_sword");
        cte.put("钻石锹", "diamond_shovel");
        cte.put("钻石镐", "diamond_pickaxe");
        cte.put("钻石斧", "diamond_axe");
        cte.put("钻石锄", "diamond_hoe");
        cte.put("金剑", "golden_sword");
        cte.put("金锹", "golden_shovel");
        cte.put("金镐", "golden_pickaxe");
        cte.put("金斧", "golden_axe");
        cte.put("金锄", "golden_hoe");
        cte.put("皮革头盔", "leather_helmet");
        cte.put("皮革胸甲", "leather_chestplate");
        cte.put("皮革裤子", "leather_leggings");
        cte.put("皮革靴子", "leather_boots");
        cte.put("锁链头盔", "chainmail_helmet");
        cte.put("锁链胸甲", "chainmail_chestplate");
        cte.put("锁链护腿", "chainmail_leggings");
        cte.put("锁链靴子", "chainmail_boots");
        cte.put("铁头盔", "iron_helmet");
        cte.put("铁胸甲", "iron_chestplate");
        cte.put("铁护腿", "iron_leggings");
        cte.put("铁靴子", "iron_boots");
        cte.put("钻石头盔", "diamond_helmet");
        cte.put("钻石胸甲", "diamond_chestplate");
        cte.put("钻石护腿", "diamond_leggings");
        cte.put("钻石靴子", "diamond_boots");
        cte.put("金头盔", "golden_helmet");
        cte.put("金胸甲", "golden_chestplate");
        cte.put("金护腿", "golden_leggings");
        cte.put("金靴子", "golden_boots");
        cte.put("海龟壳", "turtle_helmet");
        cte.put("鳞甲", "scute");
        cte.put("打火石", "flint_and_steel");
        cte.put("弓", "bow");
        cte.put("箭", "arrow");
        cte.put("苹果", "apple");
        cte.put("煤炭", "coal");
        cte.put("木炭", "charcoal");
        cte.put("钻石", "diamond");
        cte.put("铁锭", "iron_ingot");
        cte.put("金锭", "gold_ingot");
        cte.put("木棍", "stick");
        cte.put("碗", "bowl");
        cte.put("蘑菇煲", "mushroom_stew");
        cte.put("线", "string");
        cte.put("羽毛", "feather");
        cte.put("火药", "gunpowder");
        cte.put("小麦种子", "wheat_seeds");
        cte.put("小麦", "wheat");
        cte.put("面包", "bread");
        cte.put("燧石", "flint");
        cte.put("生猪排", "porkchop");
        cte.put("熟猪排", "cooked_porkchop");
        cte.put("画", "painting");
        cte.put("金苹果", "golden_apple");
        cte.put("附魔金苹果", "enchanted_golden_apple");
        cte.put("桶", "bucket");
        cte.put("水桶", "water_bucket");
        cte.put("熔岩桶", "lava_bucket");
        cte.put("奶桶", "milk_bucket");
        cte.put("矿车", "minecart");
        cte.put("鞍", "saddle");
        cte.put("红石", "redstone");
        cte.put("雪球", "snowball");
        cte.put("橡木船", "oak_boat");
        cte.put("云杉木船", "spruce_boat");
        cte.put("白桦木船", "birch_boat");
        cte.put("丛林木船", "jungle_boat");
        cte.put("金合欢木船", "acacia_boat");
        cte.put("深色橡木船", "dark_oak_boat");
        cte.put("红树木船", "mangrove_boat");
        cte.put("橡木运输船", "oak_chest_boat");
        cte.put("云杉木运输船", "spruce_chest_boat");
        cte.put("白桦木运输船", "birch_chest_boat");
        cte.put("丛林木运输船", "jungle_chest_boat");
        cte.put("金合欢木运输船", "acacia_chest_boat");
        cte.put("深色橡木运输船", "dark_oak_chest_boat");
        cte.put("红树木运输船", "mangrove_chest_boat");
        cte.put("皮革", "leather");
        cte.put("河豚桶", "pufferfish_bucket");
        cte.put("鲑鱼桶", "salmon_bucket");
        cte.put("鳕鱼桶", "cod_bucket");
        cte.put("热带鱼桶", "tropical_fish_bucket");
        cte.put("红砖", "brick");
        cte.put("黏土", "clay_ball");
        cte.put("甘蔗", "sugar_cane");
        cte.put("海带", "kelp");
        cte.put("纸", "paper");
        cte.put("书", "book");
        cte.put("黏液球", "slime_ball");
        cte.put("运输矿车", "chest_minecart");
        cte.put("动力矿车", "furnace_minecart");
        cte.put("TNT矿车", "tnt_minecart");
        cte.put("漏斗矿车", "hopper_minecart");
        cte.put("命令方块矿车", "command_block_minecart");
        cte.put("鸡蛋", "egg");
        cte.put("指南针", "compass");
        cte.put("追溯指针", "recovery_compass");
        cte.put("钓鱼竿", "fishing_rod");
        cte.put("时钟", "clock");
        cte.put("荧石粉", "glowstone_dust");
        cte.put("生鳕鱼", "cod");
        cte.put("生鲑鱼", "salmon");
        cte.put("热带鱼", "tropical_fish");
        cte.put("河豚", "pufferfish");
        cte.put("熟鳕鱼", "cooked_cod");
        cte.put("熟鲑鱼", "cooked_salmon");
        cte.put("蜂蜜瓶", "honey_bottle");
        cte.put("蜜脾", "honeycomb");
        cte.put("墨囊", "ink_sac");
        cte.put("红色染料", "red_dye");
        cte.put("绿色染料", "green_dye");
        cte.put("可可豆", "cocoa_beans");
        cte.put("青金石", "lapis_lazuli");
        cte.put("紫色染料", "purple_dye");
        cte.put("青色染料", "cyan_dye");
        cte.put("淡灰色染料", "light_gray_dye");
        cte.put("灰色染料", "gray_dye");
        cte.put("粉红色染料", "pink_dye");
        cte.put("黄绿色染料", "lime_dye");
        cte.put("黄色染料", "yellow_dye");
        cte.put("淡蓝色染料", "light_blue_dye");
        cte.put("品红色染料", "magenta_dye");
        cte.put("橙色染料", "orange_dye");
        cte.put("骨粉", "bone_meal");
        cte.put("蓝色染料", "blue_dye");
        cte.put("棕色染料", "brown_dye");
        cte.put("黑色染料", "black_dye");
        cte.put("白色染料", "white_dye");
        cte.put("骨头", "bone");
        cte.put("糖", "sugar");
        cte.put("曲奇", "cookie");
        cte.put("剪刀", "shears");
        cte.put("西瓜片", "melon_slice");
        cte.put("干海带", "dried_kelp");
        cte.put("南瓜种子", "pumpkin_seeds");
        cte.put("西瓜种子", "melon_seeds");
        cte.put("生牛肉", "beef");
        cte.put("牛排", "cooked_beef");
        cte.put("生鸡肉", "chicken");
        cte.put("熟鸡肉", "cooked_chicken");
        cte.put("腐肉", "rotten_flesh");
        cte.put("末影珍珠", "ender_pearl");
        cte.put("烈焰棒", "blaze_rod");
        cte.put("恶魂之泪", "ghast_tear");
        cte.put("金粒", "gold_nugget");
        cte.put("下界疣", "nether_wart");
        cte.put("玻璃瓶", "glass_bottle");
        cte.put("药水", "potion");
        cte.put("喷溅药水", "splash_potion");
        cte.put("滞留药水", "lingering_potion");
        cte.put("药箭", "tipped_arrow");
        cte.put("光灵箭", "spectral_arrow");
        cte.put("蜘蛛眼", "spider_eye");
        cte.put("发酵蛛眼", "fermented_spider_eye");
        cte.put("烈焰粉", "blaze_powder");
        cte.put("岩浆膏", "magma_cream");
        cte.put("末影之眼", "ender_eye");
        cte.put("闪烁的西瓜片", "glistering_melon_slice");
        cte.put("附魔之瓶", "experience_bottle");
        cte.put("火焰弹", "fire_charge");
        cte.put("书与笔", "writable_book");
        cte.put("成书", "written_book");
        cte.put("绿宝石", "emerald");
        cte.put("物品展示框", "item_frame");
        cte.put("胡萝卜", "carrot");
        cte.put("马铃薯", "potato");
        cte.put("烤马铃薯", "baked_potato");
        cte.put("毒马铃薯", "poisonous_potato");
        cte.put("空地图", "map");
        cte.put("地图或探险家地图", "filled_map");
        cte.put("金胡萝卜", "golden_carrot");
        cte.put("胡萝卜钓竿", "carrot_on_a_stick");
        cte.put("下界之星", "nether_star");
        cte.put("南瓜派", "pumpkin_pie");
        cte.put("烟花火箭", "firework_rocket");
        cte.put("烟火之星", "firework_star");
        cte.put("附魔书", "enchanted_book");
        cte.put("下界砖", "nether_brick");
        cte.put("下界石英", "quartz");
        cte.put("海晶碎片", "prismarine_shard");
        cte.put("海晶砂粒", "prismarine_crystals");
        cte.put("生兔肉", "rabbit");
        cte.put("熟兔肉", "cooked_rabbit");
        cte.put("兔肉煲", "rabbit_stew");
        cte.put("兔子脚", "rabbit_foot");
        cte.put("兔子皮", "rabbit_hide");
        cte.put("盔甲架", "armor_stand");
        cte.put("铁马铠", "iron_horse_armor");
        cte.put("金马铠", "golden_horse_armor");
        cte.put("钻石马铠", "diamond_horse_armor");
        cte.put("拴绳", "lead");
        cte.put("命名牌", "name_tag");
        cte.put("生羊肉", "mutton");
        cte.put("熟羊肉", "cooked_mutton");
        cte.put("末地水晶", "end_crystal");
        cte.put("紫颂果", "chorus_fruit");
        cte.put("爆裂紫颂果", "popped_chorus_fruit");
        cte.put("甜菜根", "beetroot");
        cte.put("甜菜种子", "beetroot_seeds");
        cte.put("甜菜汤", "beetroot_soup");
        cte.put("龙息", "dragon_breath");
        cte.put("盾牌", "shield");
        cte.put("鞘翅", "elytra");
        cte.put("不死图腾", "totem_of_undying");
        cte.put("潜影壳", "shulker_shell");
        cte.put("铁粒", "iron_nugget");
        cte.put("知识之书", "knowledge_book");
        cte.put("三叉戟", "trident");
        cte.put("幻翼膜", "phantom_membrane");
        cte.put("鹦鹉螺壳", "nautilus_shell");
        cte.put("海洋之心", "heart_of_the_sea");
        cte.put("音乐唱片13", "music_disc_13");
        cte.put("音乐唱片Cat", "music_disc_cat");
        cte.put("音乐唱片Blocks", "music_disc_blocks");
        cte.put("音乐唱片Chirp", "music_disc_chirp");
        cte.put("音乐唱片Far", "music_disc_far");
        cte.put("音乐唱片Mall", "music_disc_mall");
        cte.put("音乐唱片Mellohi", "music_disc_mellohi");
        cte.put("音乐唱片Stal", "music_disc_stal");
        cte.put("音乐唱片Strad", "music_disc_strad");
        cte.put("音乐唱片Ward", "music_disc_ward");
        cte.put("音乐唱片11", "music_disc_11");
        cte.put("音乐唱片Wait", "music_disc_wait");
        cte.put("调试棒", "debug_stick");
        cte.put("蝙蝠刷怪蛋", "bat_spawn_egg");
        cte.put("蜜蜂刷怪蛋", "bee_spawn_egg");
        cte.put("烈焰人刷怪蛋", "blaze_spawn_egg");
        cte.put("猫刷怪蛋", "cat_spawn_egg");
        cte.put("洞穴蜘蛛刷怪蛋", "cave_spider_spawn_egg");
        cte.put("鸡刷怪蛋", "chicken_spawn_egg");
        cte.put("鳕鱼刷怪蛋", "cod_spawn_egg");
        cte.put("牛刷怪蛋", "cow_spawn_egg");
        cte.put("苦力怕刷怪蛋", "creeper_spawn_egg");
        cte.put("海豚刷怪蛋", "dolphin_spawn_egg");
        cte.put("骡刷怪蛋", "donkey_spawn_egg");
        cte.put("溺尸刷怪蛋", "drowned_spawn_egg");
        cte.put("远古守卫者刷怪蛋", "elder_guardian_spawn_egg");
        cte.put("末影人刷怪蛋", "enderman_spawn_egg");
        cte.put("末影螨刷怪蛋", "endermite_spawn_egg");
        cte.put("唤魔者刷怪蛋", "evoker_spawn_egg");
        cte.put("青蛙刷怪蛋", "frog_spawn_egg");
        cte.put("恶魂刷怪蛋", "ghast_spawn_egg");
        cte.put("守卫者刷怪蛋", "guardian_spawn_egg");
        cte.put("马刷怪蛋", "horse_spawn_egg");
        cte.put("尸壳刷怪蛋", "husk_spawn_egg");
        cte.put("劫掠兽刷怪蛋", "ravager_spawn_egg");
        cte.put("羊驼刷怪蛋", "llama_spawn_egg");
        cte.put("岩浆怪刷怪蛋", "magma_cube_spawn_egg");
        cte.put("哞菇刷怪蛋", "mooshroom_spawn_egg");
//        cte.put("骡刷怪蛋", "mule_spawn_egg");
        cte.put("豹猫刷怪蛋", "ocelot_spawn_egg");
        cte.put("熊猫刷怪蛋", "panda_spawn_egg");
        cte.put("鹦鹉刷怪蛋", "parrot_spawn_egg");
        cte.put("幻翼刷怪蛋", "phantom_spawn_egg");
        cte.put("猪刷怪蛋", "pig_spawn_egg");
        cte.put("掠夺者刷怪蛋", "pillager_spawn_egg");
        cte.put("北极熊刷怪蛋", "polar_bear_spawn_egg");
        cte.put("河豚刷怪蛋", "pufferfish_spawn_egg");
        cte.put("兔子刷怪蛋", "rabbit_spawn_egg");
        cte.put("鲑鱼刷怪蛋", "salmon_spawn_egg");
        cte.put("绵羊刷怪蛋", "sheep_spawn_egg");
        cte.put("潜影贝刷怪蛋", "shulker_spawn_egg");
        cte.put("蠹虫刷怪蛋", "silverfish_spawn_egg");
        cte.put("骷髅刷怪蛋", "skeleton_spawn_egg");
        cte.put("骷髅马刷怪蛋", "skeleton_horse_spawn_egg");
        cte.put("史莱姆刷怪蛋", "slime_spawn_egg");
        cte.put("蜘蛛刷怪蛋", "spider_spawn_egg");
        cte.put("鱿鱼刷怪蛋", "squid_spawn_egg");
        cte.put("流浪者刷怪蛋", "stray_spawn_egg");
        cte.put("蝌蚪刷怪蛋", "tadpole_spawn_egg");
        cte.put("热带鱼刷怪蛋", "tropical_fish_spawn_egg");
        cte.put("海龟刷怪蛋", "turtle_spawn_egg");
        cte.put("恼鬼刷怪蛋", "vex_spawn_egg");
        cte.put("村民刷怪蛋", "villager_spawn_egg");
        cte.put("卫道士刷怪蛋", "vindicator_spawn_egg");
        cte.put("监守者刷怪蛋", "warden_spawn_egg");
        cte.put("女巫刷怪蛋", "witch_spawn_egg");
        cte.put("凋灵骷髅刷怪蛋", "wither_skeleton_spawn_egg");
        cte.put("狼刷怪蛋", "wolf_spawn_egg");
        cte.put("僵尸刷怪蛋", "zombie_spawn_egg");
        cte.put("僵尸马刷怪蛋", "zombie_horse_spawn_egg");
        cte.put("僵尸猪人刷怪蛋", "zombie_pigman_spawn_egg");
        cte.put("僵尸村民刷怪蛋", "zombie_villager_spawn_egg");
        cte.put("弩", "crossbow");
        cte.put("旗帜图案（花盾徽）", "flower_banner_pattern");
        cte.put("旗帜图案（苦力怕盾徽）", "creeper_banner_pattern");
        cte.put("旗帜图案（头颅盾徽）", "skull_banner_pattern");
        cte.put("旗帜图案（Mojang盾徽）", "mojang_banner_pattern");
        cte.put("迷之炖菜", "suspicious_stew");
        cte.put("回响碎片", "echo_shard");

        //return cte.get(ItemChineseName);
        if (cte.get(ItemChineseName) == null) {
            return b1.getBlockName(ItemChineseName);
        } else {
            return cte.get(ItemChineseName);
        }
    }

    /**
     * getItemChineseName()
     *
     * @param ItemName ItemName<br/>
     * @return Item中文名或者null <br/>
     * @author qfys521
     */
    public String getItemChineseName(String ItemName) {
        Blocks b2 = new Blocks();
        HashMap<String, String> etc = new HashMap<>();
        etc.put("iron_sword", "铁剑");
        etc.put("iron_shovel", "铁锹");
        etc.put("iron_pickaxe", "铁镐");
        etc.put("iron_axe", "铁斧");
        etc.put("iron_hoe", "铁锄");
        etc.put("wooden_sword", "木剑");
        etc.put("wooden_shovel", "木锹");
        etc.put("wooden_pickaxe", "木镐");
        etc.put("wooden_axe", "木斧");
        etc.put("wooden_hoe", "木锄");
        etc.put("stone_sword", "石剑");
        etc.put("stone_shovel", "石锹");
        etc.put("stone_pickaxe", "石镐");
        etc.put("stone_axe", "石斧");
        etc.put("stone_hoe", "石锄");
        etc.put("diamond_sword", "钻石剑");
        etc.put("diamond_shovel", "钻石锹");
        etc.put("diamond_pickaxe", "钻石镐");
        etc.put("diamond_axe", "钻石斧");
        etc.put("diamond_hoe", "钻石锄");
        etc.put("golden_sword", "金剑");
        etc.put("golden_shovel", "金锹");
        etc.put("golden_pickaxe", "金镐");
        etc.put("golden_axe", "金斧");
        etc.put("golden_hoe", "金锄");
        etc.put("leather_helmet", "皮革头盔");
        etc.put("leather_chestplate", "皮革胸甲");
        etc.put("leather_leggings", "皮革裤子");
        etc.put("leather_boots", "皮革靴子");
        etc.put("chainmail_helmet", "锁链头盔");
        etc.put("chainmail_chestplate", "锁链胸甲");
        etc.put("chainmail_leggings", "锁链护腿");
        etc.put("chainmail_boots", "锁链靴子");
        etc.put("iron_helmet", "铁头盔");
        etc.put("iron_chestplate", "铁胸甲");
        etc.put("iron_leggings", "铁护腿");
        etc.put("iron_boots", "铁靴子");
        etc.put("diamond_helmet", "钻石头盔");
        etc.put("diamond_chestplate", "钻石胸甲");
        etc.put("diamond_leggings", "钻石护腿");
        etc.put("diamond_boots", "钻石靴子");
        etc.put("golden_helmet", "金头盔");
        etc.put("golden_chestplate", "金胸甲");
        etc.put("golden_leggings", "金护腿");
        etc.put("golden_boots", "金靴子");
        etc.put("turtle_helmet", "海龟壳");
        etc.put("scute", "鳞甲");
        etc.put("flint_and_steel", "打火石");
        etc.put("bow", "弓");
        etc.put("arrow", "箭");
        etc.put("apple", "苹果");
        etc.put("coal", "煤炭");
        etc.put("charcoal", "木炭");
        etc.put("diamond", "钻石");
        etc.put("iron_ingot", "铁锭");
        etc.put("gold_ingot", "金锭");
        etc.put("stick", "木棍");
        etc.put("bowl", "碗");
        etc.put("mushroom_stew", "蘑菇煲");
        etc.put("string", "线");
        etc.put("feather", "羽毛");
        etc.put("gunpowder", "火药");
        etc.put("wheat_seeds", "小麦种子");
        etc.put("wheat", "小麦");
        etc.put("bread", "面包");
        etc.put("flint", "燧石");
        etc.put("porkchop", "生猪排");
        etc.put("cooked_porkchop", "熟猪排");
        etc.put("painting", "画");
        etc.put("golden_apple", "金苹果");
        etc.put("enchanted_golden_apple", "附魔金苹果");
        etc.put("bucket", "桶");
        etc.put("water_bucket", "水桶");
        etc.put("lava_bucket", "熔岩桶");
        etc.put("milk_bucket", "奶桶");
        etc.put("minecart", "矿车");
        etc.put("saddle", "鞍");
        etc.put("redstone", "红石");
        etc.put("snowball", "雪球");
        etc.put("oak_boat", "橡木船");
        etc.put("spruce_boat", "云杉木船");
        etc.put("birch_boat", "白桦木船");
        etc.put("jungle_boat", "丛林木船");
        etc.put("acacia_boat", "金合欢木船");
        etc.put("dark_oak_boat", "深色橡木船");
        etc.put("mangrove_boat", "红树木船");
        etc.put("oak_chest_boat", "橡木运输船");
        etc.put("spruce_chest_boat", "云杉木运输船");
        etc.put("birch_chest_boat", "白桦木运输船");
        etc.put("jungle_chest_boat", "丛林木运输船");
        etc.put("acacia_chest_boat", "金合欢木运输船");
        etc.put("dark_oak_chest_boat", "深色橡木运输船");
        etc.put("mangrove_chest_boat", "红树木运输船");
        etc.put("leather", "皮革");
        etc.put("pufferfish_bucket", "河豚桶");
        etc.put("salmon_bucket", "鲑鱼桶");
        etc.put("cod_bucket", "鳕鱼桶");
        etc.put("tropical_fish_bucket", "热带鱼桶");
        etc.put("brick", "红砖");
        etc.put("clay_ball", "黏土");
        etc.put("sugar_cane", "甘蔗");
        etc.put("kelp", "海带");
        etc.put("paper", "纸");
        etc.put("book", "书");
        etc.put("slime_ball", "黏液球");
        etc.put("chest_minecart", "运输矿车");
        etc.put("furnace_minecart", "动力矿车");
        etc.put("tnt_minecart", "TNT矿车");
        etc.put("hopper_minecart", "漏斗矿车");
        etc.put("command_block_minecart", "命令方块矿车");
        etc.put("egg", "鸡蛋");
        etc.put("compass", "指南针");
        etc.put("recovery_compass", "追溯指针");
        etc.put("fishing_rod", "钓鱼竿");
        etc.put("clock", "时钟");
        etc.put("glowstone_dust", "荧石粉");
        etc.put("cod", "生鳕鱼");
        etc.put("salmon", "生鲑鱼");
        etc.put("tropical_fish", "热带鱼");
        etc.put("pufferfish", "河豚");
        etc.put("cooked_cod", "熟鳕鱼");
        etc.put("cooked_salmon", "熟鲑鱼");
        etc.put("honey_bottle", "蜂蜜瓶");
        etc.put("honeycomb", "蜜脾");
        etc.put("ink_sac", "墨囊");
        etc.put("red_dye", "红色染料");
        etc.put("green_dye", "绿色染料");
        etc.put("cocoa_beans", "可可豆");
        etc.put("lapis_lazuli", "青金石");
        etc.put("purple_dye", "紫色染料");
        etc.put("cyan_dye", "青色染料");
        etc.put("light_gray_dye", "淡灰色染料");
        etc.put("gray_dye", "灰色染料");
        etc.put("pink_dye", "粉红色染料");
        etc.put("lime_dye", "黄绿色染料");
        etc.put("yellow_dye", "黄色染料");
        etc.put("light_blue_dye", "淡蓝色染料");
        etc.put("magenta_dye", "品红色染料");
        etc.put("orange_dye", "橙色染料");
        etc.put("bone_meal", "骨粉");
        etc.put("blue_dye", "蓝色染料");
        etc.put("brown_dye", "棕色染料");
        etc.put("black_dye", "黑色染料");
        etc.put("white_dye", "白色染料");
        etc.put("bone", "骨头");
        etc.put("sugar", "糖");
        etc.put("cookie", "曲奇");
        etc.put("shears", "剪刀");
        etc.put("melon_slice", "西瓜片");
        etc.put("dried_kelp", "干海带");
        etc.put("pumpkin_seeds", "南瓜种子");
        etc.put("melon_seeds", "西瓜种子");
        etc.put("beef", "生牛肉");
        etc.put("cooked_beef", "牛排");
        etc.put("chicken", "生鸡肉");
        etc.put("cooked_chicken", "熟鸡肉");
        etc.put("rotten_flesh", "腐肉");
        etc.put("ender_pearl", "末影珍珠");
        etc.put("blaze_rod", "烈焰棒");
        etc.put("ghast_tear", "恶魂之泪");
        etc.put("gold_nugget", "金粒");
        etc.put("nether_wart", "下界疣");
        etc.put("glass_bottle", "玻璃瓶");
        etc.put("potion", "药水");
        etc.put("splash_potion", "喷溅药水");
        etc.put("lingering_potion", "滞留药水");
        etc.put("tipped_arrow", "药箭");
        etc.put("spectral_arrow", "光灵箭");
        etc.put("spider_eye", "蜘蛛眼");
        etc.put("fermented_spider_eye", "发酵蛛眼");
        etc.put("blaze_powder", "烈焰粉");
        etc.put("magma_cream", "岩浆膏");
        etc.put("ender_eye", "末影之眼");
        etc.put("glistering_melon_slice", "闪烁的西瓜片");
        etc.put("experience_bottle", "附魔之瓶");
        etc.put("fire_charge", "火焰弹");
        etc.put("writable_book", "书与笔");
        etc.put("written_book", "成书");
        etc.put("emerald", "绿宝石");
        etc.put("item_frame", "物品展示框");
        etc.put("carrot", "胡萝卜");
        etc.put("potato", "马铃薯");
        etc.put("baked_potato", "烤马铃薯");
        etc.put("poisonous_potato", "毒马铃薯");
        etc.put("map", "空地图");
        etc.put("filled_map", "地图或探险家地图");
        etc.put("golden_carrot", "金胡萝卜");
        etc.put("carrot_on_a_stick", "胡萝卜钓竿");
        etc.put("nether_star", "下界之星");
        etc.put("pumpkin_pie", "南瓜派");
        etc.put("firework_rocket", "烟花火箭");
        etc.put("firework_star", "烟火之星");
        etc.put("enchanted_book", "附魔书");
        etc.put("nether_brick", "下界砖");
        etc.put("quartz", "下界石英");
        etc.put("prismarine_shard", "海晶碎片");
        etc.put("prismarine_crystals", "海晶砂粒");
        etc.put("rabbit", "生兔肉");
        etc.put("cooked_rabbit", "熟兔肉");
        etc.put("rabbit_stew", "兔肉煲");
        etc.put("rabbit_foot", "兔子脚");
        etc.put("rabbit_hide", "兔子皮");
        etc.put("armor_stand", "盔甲架");
        etc.put("iron_horse_armor", "铁马铠");
        etc.put("golden_horse_armor", "金马铠");
        etc.put("diamond_horse_armor", "钻石马铠");
        etc.put("lead", "拴绳");
        etc.put("name_tag", "命名牌");
        etc.put("mutton", "生羊肉");
        etc.put("cooked_mutton", "熟羊肉");
        etc.put("end_crystal", "末地水晶");
        etc.put("chorus_fruit", "紫颂果");
        etc.put("popped_chorus_fruit", "爆裂紫颂果");
        etc.put("beetroot", "甜菜根");
        etc.put("beetroot_seeds", "甜菜种子");
        etc.put("beetroot_soup", "甜菜汤");
        etc.put("dragon_breath", "龙息");
        etc.put("shield", "盾牌");
        etc.put("elytra", "鞘翅");
        etc.put("totem_of_undying", "不死图腾");
        etc.put("shulker_shell", "潜影壳");
        etc.put("iron_nugget", "铁粒");
        etc.put("knowledge_book", "知识之书");
        etc.put("trident", "三叉戟");
        etc.put("phantom_membrane", "幻翼膜");
        etc.put("nautilus_shell", "鹦鹉螺壳");
        etc.put("heart_of_the_sea", "海洋之心");
        etc.put("music_disc_13", "音乐唱片13");
        etc.put("music_disc_cat", "音乐唱片Cat");
        etc.put("music_disc_blocks", "音乐唱片Blocks");
        etc.put("music_disc_chirp", "音乐唱片Chirp");
        etc.put("music_disc_far", "音乐唱片Far");
        etc.put("music_disc_mall", "音乐唱片Mall");
        etc.put("music_disc_mellohi", "音乐唱片Mellohi");
        etc.put("music_disc_stal", "音乐唱片Stal");
        etc.put("music_disc_strad", "音乐唱片Strad");
        etc.put("music_disc_ward", "音乐唱片Ward");
        etc.put("music_disc_11", "音乐唱片11");
        etc.put("music_disc_wait", "音乐唱片Wait");
        etc.put("debug_stick", "调试棒");
        etc.put("bat_spawn_egg", "蝙蝠刷怪蛋");
        etc.put("bee_spawn_egg", "蜜蜂刷怪蛋");
        etc.put("blaze_spawn_egg", "烈焰人刷怪蛋");
        etc.put("cat_spawn_egg", "猫刷怪蛋");
        etc.put("cave_spider_spawn_egg", "洞穴蜘蛛刷怪蛋");
        etc.put("chicken_spawn_egg", "鸡刷怪蛋");
        etc.put("cod_spawn_egg", "鳕鱼刷怪蛋");
        etc.put("cow_spawn_egg", "牛刷怪蛋");
        etc.put("creeper_spawn_egg", "苦力怕刷怪蛋");
        etc.put("dolphin_spawn_egg", "海豚刷怪蛋");
        etc.put("donkey_spawn_egg", "骡刷怪蛋");
        etc.put("drowned_spawn_egg", "溺尸刷怪蛋");
        etc.put("elder_guardian_spawn_egg", "远古守卫者刷怪蛋");
        etc.put("enderman_spawn_egg", "末影人刷怪蛋");
        etc.put("endermite_spawn_egg", "末影螨刷怪蛋");
        etc.put("evoker_spawn_egg", "唤魔者刷怪蛋");
        etc.put("frog_spawn_egg", "青蛙刷怪蛋");
        etc.put("ghast_spawn_egg", "恶魂刷怪蛋");
        etc.put("guardian_spawn_egg", "守卫者刷怪蛋");
        etc.put("horse_spawn_egg", "马刷怪蛋");
        etc.put("husk_spawn_egg", "尸壳刷怪蛋");
        etc.put("ravager_spawn_egg", "劫掠兽刷怪蛋");
        etc.put("llama_spawn_egg", "羊驼刷怪蛋");
        etc.put("magma_cube_spawn_egg", "岩浆怪刷怪蛋");
        etc.put("mooshroom_spawn_egg", "哞菇刷怪蛋");
        etc.put("mule_spawn_egg", "骡刷怪蛋");
        etc.put("ocelot_spawn_egg", "豹猫刷怪蛋");
        etc.put("panda_spawn_egg", "熊猫刷怪蛋");
        etc.put("parrot_spawn_egg", "鹦鹉刷怪蛋");
        etc.put("phantom_spawn_egg", "幻翼刷怪蛋");
        etc.put("pig_spawn_egg", "猪刷怪蛋");
        etc.put("pillager_spawn_egg", "掠夺者刷怪蛋");
        etc.put("polar_bear_spawn_egg", "北极熊刷怪蛋");
        etc.put("pufferfish_spawn_egg", "河豚刷怪蛋");
        etc.put("rabbit_spawn_egg", "兔子刷怪蛋");
        etc.put("salmon_spawn_egg", "鲑鱼刷怪蛋");
        etc.put("sheep_spawn_egg", "绵羊刷怪蛋");
        etc.put("shulker_spawn_egg", "潜影贝刷怪蛋");
        etc.put("silverfish_spawn_egg", "蠹虫刷怪蛋");
        etc.put("skeleton_spawn_egg", "骷髅刷怪蛋");
        etc.put("skeleton_horse_spawn_egg", "骷髅马刷怪蛋");
        etc.put("slime_spawn_egg", "史莱姆刷怪蛋");
        etc.put("spider_spawn_egg", "蜘蛛刷怪蛋");
        etc.put("squid_spawn_egg", "鱿鱼刷怪蛋");
        etc.put("stray_spawn_egg", "流浪者刷怪蛋");
        etc.put("tadpole_spawn_egg", "蝌蚪刷怪蛋");
        etc.put("tropical_fish_spawn_egg", "热带鱼刷怪蛋");
        etc.put("turtle_spawn_egg", "海龟刷怪蛋");
        etc.put("vex_spawn_egg", "恼鬼刷怪蛋");
        etc.put("villager_spawn_egg", "村民刷怪蛋");
        etc.put("vindicator_spawn_egg", "卫道士刷怪蛋");
        etc.put("warden_spawn_egg", "监守者刷怪蛋");
        etc.put("witch_spawn_egg", "女巫刷怪蛋");
        etc.put("wither_skeleton_spawn_egg", "凋灵骷髅刷怪蛋");
        etc.put("wolf_spawn_egg", "狼刷怪蛋");
        etc.put("zombie_spawn_egg", "僵尸刷怪蛋");
        etc.put("zombie_horse_spawn_egg", "僵尸马刷怪蛋");
        etc.put("zombie_pigman_spawn_egg", "僵尸猪人刷怪蛋");
        etc.put("zombie_villager_spawn_egg", "僵尸村民刷怪蛋");
        etc.put("crossbow", "弩");
        etc.put("flower_banner_pattern", "旗帜图案（花盾徽）");
        etc.put("creeper_banner_pattern", "旗帜图案（苦力怕盾徽）");
        etc.put("skull_banner_pattern", "旗帜图案（头颅盾徽）");
        etc.put("mojang_banner_pattern", "旗帜图案（Mojang盾徽）");
        etc.put("suspicious_stew", "迷之炖菜");
        etc.put("echo_shard", "回响碎片");

        //return etc.get(ItemName);
        if (etc.get(ItemName) == null) {
            return b2.getBlockChineseName(ItemName);
        } else {
            return etc.get(ItemName);
        }
    }

}