package mcneb10stuff.mod.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {
	
	public static enum TVTypes implements IStringSerializable {
		OLD("old", 0),
		NEW("new", 1);
		
		private int ID;
		private String name;
		
		private TVTypes(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}

		@Override
		public String getName() {
			return this.name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}

	public static enum ClassTypes implements IStringSerializable {
		
		CLASS("class", 0),
		INTERFACE("interface", 1),
		ENUM("enum", 2),
		ANNOTATION("annotation", 3);
		

		private int ID;
		private String name;
		
		@Override
		public String getName() {
			return name;
		}
		
		private ClassTypes(String name, int ID) {
			this.ID = ID;
			this.name = name;
		}
		
		public int getID() {
			return ID;
		}
		
		@Override
		public String toString() {
			return getName();
		}
		
	}
	
}
