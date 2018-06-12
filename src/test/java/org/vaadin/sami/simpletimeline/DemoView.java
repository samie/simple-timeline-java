package org.vaadin.sami.simpletimeline;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route("")
@Theme(Lumo.class)
public class DemoView extends VerticalLayout {

    public DemoView() {
        SimpleTimeline c = new SimpleTimeline();
        c.setWidth("100%");
        c.setHeight("400px");
        c.add(new SimpleTimelineItem("Test", 10, 1));
        c.add(new SimpleTimelineItem("Test 2", 50, 1));
        add(c);

        /*
        Label l = new Label("Hello world");
        Button b = new Button("Click me", e -> {
            Notification.show("Clicked!");});
        add(l,b);
        */

    }
}
