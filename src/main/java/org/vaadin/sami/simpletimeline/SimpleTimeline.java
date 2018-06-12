package org.vaadin.sami.simpletimeline;

import com.vaadin.flow.component.*;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.internal.HtmlUtils;
import elemental.html.HtmlElement;

import java.util.ArrayList;
import java.util.List;

@HtmlImport("bower_components/simple-timeline/simple-timeline.html")
@Tag("simple-timeline")
public class SimpleTimeline extends Component implements HasSize, HasComponents {

    public SimpleTimeline() {
    }

    public void add(SimpleTimelineItem item) {
        getElement().appendChild(item.getElement());
    }
}
