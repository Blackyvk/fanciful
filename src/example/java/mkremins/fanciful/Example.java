/**
 * The MIT License
 * Copyright (c) 2015 Teal Cube Games
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package mkremins.fanciful;

import static org.bukkit.ChatColor.*;

/**
 * An example class demonstrating some of Fanciful's functionality.
 * This is not a plugin, but a program.
 */
public final class Example {
	
	public static void main(String[] args) {
		System.out.println(welcome("Orbixitron"));
		System.out.println(advertisement());
		System.out.println(gui("Starbux42", 413000));
	}

	static String welcome(String playername) {
		return new FancyMessage("Hello, ")
			.color(YELLOW)
		.then(playername)
			.color(LIGHT_PURPLE)
			.style(ITALIC, UNDERLINE)
		.then("!")
			.color(YELLOW)
			.style(ITALIC)
		.toJSONString();
	}
	
	static String advertisement() {
		return new FancyMessage("Visit ")
			.color(GREEN)
		.then("our website")
			.color(YELLOW)
			.style(UNDERLINE)
			.link("http://awesome-server.net")
			.tooltip("AwesomeServer Forums")
		.then(" to win ")
			.color(GREEN)
		.then("big prizes!")
			.color(AQUA)
			.style(BOLD)
			.tooltip("Terms and conditions may apply. Offer not valid in Sweden.")
		.toJSONString();
	}
	
	static String gui(String playername, int blocksEdited) {
		return new FancyMessage("Player ")
			.color(DARK_RED)
		.then(playername)
			.color(RED)
			.style(ITALIC)
		.then(" changed ").color(DARK_RED)
		.then(Integer.toString(blocksEdited)).color(AQUA)
		.then(" blocks. ").color(DARK_RED)
		.then("Roll back?")
			.color(GOLD)
			.style(UNDERLINE)
			.suggest("/rollenbacken " + playername)
			.tooltip("Be careful, this might undo legitimate edits!")
		.then(" ")
		.then("Ban?")
			.color(RED)
			.style(UNDERLINE)
			.suggest("/banhammer " + playername)
			.tooltip("Remember: only ban if you have photographic evidence of grief.")
		.toJSONString();
	}
	
}
