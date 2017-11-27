package com.Zrips.CMI.Modules.Attributes;

public enum AttributeType {
    MaxHealth("generic", "maxHealth", 0),
    KnockbackResistance("generic", "knockbackResistance", 0),
    MovementSpeed("generic", "movementSpeed", 1),
    AttackDamage("generic", "attackDamage", 0),
    Armor("generic", "armor", 0),
    ArmorToughness("generic", "armorToughness", 0),
    AttackSpeed("generic", "attackSpeed", 2),
    Luck("generic", "luck", 0);

    private String name;
    private String preName;
    private int action;

    private AttributeType(String preName, String name, int action) {
	this.preName = preName;
	this.name = name;
	this.action = action;
    }

    public String getPreName() {
	return preName;
    }

    public String getFullName() {
	return preName + "." + name;
    }

    public String getName() {
	return name;
    }

    public static AttributeType get(String code) {
	for (AttributeType e : AttributeType.values()) {
	    if (code.equalsIgnoreCase(e.name))
		return e;
	}
	return null;
    }

    public int getAction() {
	return action;
    }
}
