package com.vogella.tycho.rcp.it.tests.swtbot;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class MenuTest {

	private static SWTBot bot;
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTBot();
	}
	@Test
    public void ensureSaveIsDisabledWhenNothingIsDirty() {
        SWTBotMenu menu = bot.menu("File").menu("Save");

        assertThat("Save command in menu is not enabled", not(menu.isEnabled()));
    }
}
