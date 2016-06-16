package com.caiyu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class GreenDaoGenerator {
    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.caiyu.hearthstone.model.entity");
        schema.setDefaultJavaPackageDao("com.caiyu.hearthstone.model.dao");
        addCard(schema);

        new DaoGenerator().generateAll(schema, "/MyAndroidProjects/HearthStone/app/src/main/java");
    }

    private static void addCard(Schema schema) {
        Entity card = schema.addEntity("CardEntity");
        card.setTableName("card");
        card.setClassNameDao("CardDao");
        card.addIdProperty().notNull().autoincrement();
        card.addStringProperty("name").notNull(); //卡牌名称
        card.addStringProperty("color").notNull();    //基础/普通/稀有/史诗/传说
        card.addIntProperty("cost").notNull();   //费用
        card.addStringProperty("job").notNull(); //所属职业
        card.addStringProperty("type").notNull(); //随从牌/法术牌/武器牌
        card.addIntProperty("attack"); //攻击力
        card.addIntProperty("blood");  //血量
//        card.addBooleanProperty("isTaunt"); //嘲讽？
//        card.addBooleanProperty("hasCharge");   //冲锋？
//        card.addBooleanProperty("isHide");  //隐藏？
//        card.addBooleanProperty("hasSanShield");    //带圣盾？
//        card.addBooleanProperty("hasBattleCry");    //带战吼效果？
//        card.addBooleanProperty("hasDeathRattle");  //带亡语效果？
        card.addStringProperty("description");  //卡牌描述
    }

    private static void addNote(Schema schema) {
        Entity note = schema.addEntity("NoteEntity");
        note.setTableName("note");
        note.setClassNameDao("NoteDao");
        note.addIdProperty();
        note.addStringProperty("textUtil").notNull();
        note.addStringProperty("comment");
    }

    private static void addCustomerOrder(Schema schema) {
        Entity customer = schema.addEntity("CustomerEntity");
        customer.addIdProperty();
        customer.addStringProperty("name").notNull();
//
//        Entity order = schema.addEntity("Order");
//        order.setTableName("ORDERS"); // "ORDER" is a reserved keyword
//        order.addIdProperty();
//        Property orderDate = order.addDateProperty("date").getProperty();
//        Property customerId = order.addLongProperty("customerId").notNull().getProperty();
//        order.addToOne(customer, customerId);
//
//        ToMany customerToOrders = customer.addToMany(order, customerId);
//        customerToOrders.setName("orders");
//        customerToOrders.orderAsc(orderDate);
    }
}
