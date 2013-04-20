package LetsMod;

import LetsMod.Lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Reference.MOD_ID,
		name = Reference.MOD_NAME,
		version = Reference.MOD_VERSION
)

public class LetsMod {
	//voor de mod wordt geladen
	//worden de blocken en items geladen en geregistreerd
	@PreInit
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	//init van de mod zelf
	@Init
	public void init(FMLInitializationEvent event){
		
	}
	
	//wordt aangeroepen nadat de mod in geheugen is geladen.
	@PostInit
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	
}
