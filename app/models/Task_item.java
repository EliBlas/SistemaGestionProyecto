package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Task_item extends Model{
        @Id
        public String id;
        public String title;
        public int completed;
        @Formats.DateTime(pattern="yyyy-mm-dd hh:mm:ss")
        public Date created;



}