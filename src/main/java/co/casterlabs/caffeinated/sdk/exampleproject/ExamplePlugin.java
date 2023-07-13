package co.casterlabs.caffeinated.sdk.exampleproject;

import co.casterlabs.caffeinated.pluginsdk.CaffeinatedPlugin;
import co.casterlabs.caffeinated.pluginsdk.CaffeinatedPluginImplementation;

@CaffeinatedPluginImplementation
public class ExamplePlugin extends CaffeinatedPlugin {

	@Override
	public void onInit() {
		this.getLogger().info("Hello World!");
	}

	@Override
	public void onClose() {
		this.getLogger().info("Goodbye World!");
	}

	@Override
	public String getName() {
		return "Example Plugin";
	}

	@Override
	public String getId() {
		return "co.casterlabs.caffeinated.sdk.exampleproject"; // THIS MUST BE UNIQUE TO YOUR PROJECT!
	}

}