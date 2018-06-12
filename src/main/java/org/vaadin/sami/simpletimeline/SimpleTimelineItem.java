package org.vaadin.sami.simpletimeline;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.dom.Element;

@HtmlImport("bower_components/simple-timeline/simple-timeline-item.html")
@Tag("simple-timeline-item")
public class SimpleTimelineItem extends Component {

    public SimpleTimelineItem(String title) {
        setTitle(title);
    }

    public SimpleTimelineItem(String title, int x , int y) {
        setTitle(title);
        setX(x);
        setY(y);
    }

    public void setTitle(String title) {
        getElement().setAttribute("title", title);
    }
    public String getTitle() {
        return  getElement().getAttribute("title");
    }

    public void setX(int percentage) {
        getElement().setAttribute("x", Integer.toString(percentage));
    }

    public int getX() {
        return Integer.parseInt(getElement().getAttribute("x"));

    }

    /** Set the item height.
     *   Possible values are -3, -2, -1, 1, 2, 3
     *   defaults to 1
     * @param row
     */
    public void setY(int row) {
        if (row < -3 || row > 3 || row == 0) {
            row = 1;
        }
        getElement().setAttribute("y", Integer.toString(row));
    }

    public int getY() {
        return Integer.parseInt(getElement().getAttribute("y"));
    }

}
