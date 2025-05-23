/*     */ package ai.grazie.model.task.library.text;
/*     */ 
/*     */ import ai.grazie.model.task.exec.TaskParameters;
/*     */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*     */ import ai.grazie.model.task.id.TaskTag;
/*     */ import ai.grazie.model.task.id.TaskTagDescriptor;
/*     */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.AttributesBuilder;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM;", "", "()V", "Grazie", "Youtrack", "model-task"})
/*     */ public final class LLM
/*     */ {
/*     */   @NotNull
/*     */   public static final LLM INSTANCE = new LLM();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie;", "", "()V", "Default", "Params", "Schema", "model-task"})
/*     */   public static final class Grazie
/*     */   {
/*     */     @NotNull
/*     */     public static final Grazie INSTANCE = new Grazie();
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Default;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Default
/*     */       implements TaskTagDescriptor.Stable
/*     */     {
/*     */       @NotNull
/*  81 */       public static final Default INSTANCE = new Default(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default"); @NotNull public TaskTag getTag() { return tag; }
/*     */        }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R8\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\r¢\006\b\n\000\032\004\b\021\020\017R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\024\020\025¨\006\026"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "words", "Lai/grazie/utils/attributes/AttributeDescriptor$Int;", "getWords", "()Lai/grazie/utils/attributes/AttributeDescriptor$Int;", "model-task"})
/*     */     public static final class Schema implements TaskSchemaDescriptor { @NotNull
/*  85 */       public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/*  86 */       private static final AttributeDescriptor.Int words = new AttributeDescriptor.Int("words"); @NotNull public final AttributeDescriptor.Int getWords() { return words; } @NotNull
/*  87 */       private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */       
/*     */       @NotNull
/*  90 */       public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[3]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)text; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)words; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)lang; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\t\b\007\030\000 \0212\0020\001:\001\021B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003¢\006\002\020\007R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\n\020\013R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006\022"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "words", "", "lang", "(Ljava/lang/String;ILjava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "getWords", "()I", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; private final int words; @NotNull private final String lang; @NotNull
/*     */       private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Params;", "model-task"})
/*     */       public static final class Companion { private Companion() {} @NotNull
/*  93 */         public final KSerializer<TextSummarizeTask.LLM.Grazie.Params> serializer() { return (KSerializer<TextSummarizeTask.LLM.Grazie.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */          }
/*  95 */       public Params(@NotNull String text, int words, @NotNull String lang) { this.text = text; this.words = words; this.lang = lang;
/*  96 */         this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Grazie$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } public final int getWords() { return this.words; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*  97 */       static final class TextSummarizeTask$LLM$Grazie$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.int("words", TextSummarizeTask.LLM.Grazie.Params.this.getWords());
/*  98 */           $this$build.text("text", TextSummarizeTask.LLM.Grazie.Params.this.getText());
/*  99 */           $this$build.text("lang", TextSummarizeTask.LLM.Grazie.Params.this.getLang()); }
/*     */          TextSummarizeTask$LLM$Grazie$Params$attributes$1() {
/*     */           super(1);
/*     */         } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack;", "", "()V", "Article", "Description", "Ticket", "model-task"})
/*     */   public static final class Youtrack { @NotNull
/*     */     public static final Youtrack INSTANCE = new Youtrack(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "Schema", "model-task"})
/*     */     public static final class Ticket implements TaskTagDescriptor.Stable { @NotNull
/* 106 */       public static final Ticket INSTANCE = new Ticket(); @NotNull private static final TaskTag tag = new TaskTag("llm-youtrack-ticket"); @NotNull public TaskTag getTag() { return tag; }
/*     */        @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "content", "getContent", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "lang", "getLang", "type", "getType", "model-task"})
/*     */       public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 109 */         public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text content = new AttributeDescriptor.Text("content"); @NotNull public final AttributeDescriptor.Text getContent() { return content; } @NotNull
/* 110 */         private static final AttributeDescriptor.Text type = new AttributeDescriptor.Text("type"); @NotNull public final AttributeDescriptor.Text getType() { return type; } @NotNull
/* 111 */         private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */         
/*     */         @NotNull
/* 114 */         public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[3]; arrayOfText[0] = content; arrayOfText[1] = type; arrayOfText[2] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\b\b\007\030\000 \0172\0020\001:\001\017B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\f¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "content", "", "type", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getContent", "()Ljava/lang/String;", "getLang", "getType", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String content; @NotNull private final String type; @NotNull private final String lang; @NotNull
/*     */         private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params;", "model-task"})
/*     */         public static final class Companion { @NotNull
/* 117 */           public final KSerializer<TextSummarizeTask.LLM.Youtrack.Ticket.Params> serializer() { return (KSerializer<TextSummarizeTask.LLM.Youtrack.Ticket.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */            private Companion() {} } public Params(@NotNull String content, @NotNull String type, @NotNull String lang) {
/* 119 */           this.content = content; this.type = type; this.lang = lang;
/* 120 */           this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1()); } @NotNull public final String getContent() { return this.content; } @NotNull public final String getType() { return this.type; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 121 */         static final class TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("type", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getType());
/* 122 */             $this$build.text("content", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getContent());
/* 123 */             $this$build.text("lang", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getLang()); }
/*     */            TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1() {
/*     */             super(1);
/*     */           } } } }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Description;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "Schema", "model-task"})
/*     */     public static final class Description implements TaskTagDescriptor.Stable { @NotNull
/* 129 */       public static final Description INSTANCE = new Description(); @NotNull private static final TaskTag tag = new TaskTag("llm-youtrack-issue-description"); @NotNull public TaskTag getTag() { return tag; }
/*     */        @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Description$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "content", "getContent", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "lang", "getLang", "type", "getType", "model-task"})
/*     */       public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 132 */         public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text content = new AttributeDescriptor.Text("content"); @NotNull public final AttributeDescriptor.Text getContent() { return content; } @NotNull
/* 133 */         private static final AttributeDescriptor.Text type = new AttributeDescriptor.Text("type"); @NotNull public final AttributeDescriptor.Text getType() { return type; } @NotNull
/* 134 */         private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */         
/*     */         @NotNull
/* 137 */         public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[3]; arrayOfText[0] = content; arrayOfText[1] = type; arrayOfText[2] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\b\b\007\030\000 \0172\0020\001:\001\017B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\f¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Description$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "content", "", "type", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getContent", "()Ljava/lang/String;", "getLang", "getType", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String content; @NotNull private final String type; @NotNull private final String lang; @NotNull
/*     */         private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Description$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Description$Params;", "model-task"})
/*     */         public static final class Companion { private Companion() {} @NotNull
/* 140 */           public final KSerializer<TextSummarizeTask.LLM.Youtrack.Description.Params> serializer() { return (KSerializer<TextSummarizeTask.LLM.Youtrack.Description.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */            }
/* 142 */         public Params(@NotNull String content, @NotNull String type, @NotNull String lang) { this.content = content; this.type = type; this.lang = lang;
/* 143 */           this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Youtrack$Description$Params$attributes$1()); } @NotNull public final String getContent() { return this.content; } @NotNull public final String getType() { return this.type; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 144 */         static final class TextSummarizeTask$LLM$Youtrack$Description$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("type", TextSummarizeTask.LLM.Youtrack.Description.Params.this.getType());
/* 145 */             $this$build.text("content", TextSummarizeTask.LLM.Youtrack.Description.Params.this.getContent());
/* 146 */             $this$build.text("lang", TextSummarizeTask.LLM.Youtrack.Description.Params.this.getLang()); }
/*     */            TextSummarizeTask$LLM$Youtrack$Description$Params$attributes$1() {
/*     */             super(1);
/*     */           } } } }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Article;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "Schema", "model-task"})
/*     */     public static final class Article implements TaskTagDescriptor.Stable { @NotNull
/* 152 */       public static final Article INSTANCE = new Article(); @NotNull private static final TaskTag tag = new TaskTag("llm-youtrack-article"); @NotNull public TaskTag getTag() { return tag; }
/*     */        @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Article$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "content", "getContent", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "lang", "getLang", "model-task"})
/*     */       public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 155 */         public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text content = new AttributeDescriptor.Text("content"); @NotNull public final AttributeDescriptor.Text getContent() { return content; } @NotNull
/* 156 */         private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */         
/*     */         @NotNull
/* 159 */         public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = content; arrayOfText[1] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Article$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "content", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getContent", "()Ljava/lang/String;", "getLang", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String content; @NotNull private final String lang; @NotNull
/*     */         private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Article$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Article$Params;", "model-task"})
/*     */         public static final class Companion { private Companion() {} @NotNull
/* 162 */           public final KSerializer<TextSummarizeTask.LLM.Youtrack.Article.Params> serializer() { return (KSerializer<TextSummarizeTask.LLM.Youtrack.Article.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */            }
/* 164 */         public Params(@NotNull String content, @NotNull String lang) { this.content = content; this.lang = lang;
/* 165 */           this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Youtrack$Article$Params$attributes$1()); } @NotNull public final String getContent() { return this.content; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 166 */         static final class TextSummarizeTask$LLM$Youtrack$Article$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("content", TextSummarizeTask.LLM.Youtrack.Article.Params.this.getContent());
/* 167 */             $this$build.text("lang", TextSummarizeTask.LLM.Youtrack.Article.Params.this.getLang()); }
/*     */ 
/*     */           
/*     */           TextSummarizeTask$LLM$Youtrack$Article$Params$attributes$1() {
/*     */             super(1);
/*     */           } }
/*     */          }
/*     */        }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextSummarizeTask$LLM.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */