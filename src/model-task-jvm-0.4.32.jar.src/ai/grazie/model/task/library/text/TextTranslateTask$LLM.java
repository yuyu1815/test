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
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\006\bÆ\002\030\0002\0020\001:\004\003\004\005\006B\007\b\002¢\006\002\020\002¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM;", "", "()V", "Basic", "Crowdin", "Grazie", "Youtrack", "model-task"})
/*     */ public final class LLM
/*     */ {
/*     */   @NotNull
/*     */   public static final LLM INSTANCE = new LLM();
/*     */   
/*     */   @Deprecated(message = "In favor of LLM.Grazie.Default", replaceWith = @ReplaceWith(expression = "LLM.Grazie.Default", imports = {}))
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bÇ\002\030\0002\0020\001:\001\007B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "model-task"})
/*     */   public static final class Basic
/*     */     implements TaskTagDescriptor.Stable
/*     */   {
/*     */     @NotNull
/*  49 */     public static final Basic INSTANCE = new Basic(); @NotNull private static final TaskTag tag = new TaskTag("llm-basic"); @NotNull public TaskTag getTag() { return tag; } @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @NotNull private final String lang; @NotNull private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic$Params;", "model-task"}) public static final class Companion { private Companion() {} @NotNull
/*  50 */         public final KSerializer<TextTranslateTask.LLM.Basic.Params> serializer() { return (KSerializer<TextTranslateTask.LLM.Basic.Params>)TaskParameters.Serializer.INSTANCE; } }
/*  51 */       public Params(@NotNull String text, @NotNull String lang) { this.text = text; this.lang = lang;
/*  52 */         this.attributes = Attributes.Companion.build(new TextTranslateTask$LLM$Basic$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*  53 */       static final class TextTranslateTask$LLM$Basic$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextTranslateTask.LLM.Basic.Params.this.getText());
/*  54 */           $this$build.text("lang", TextTranslateTask.LLM.Basic.Params.this.getLang()); }
/*     */          TextTranslateTask$LLM$Basic$Params$attributes$1() {
/*     */           super(1);
/*     */         } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Grazie;", "", "()V", "Default", "Params", "Schema", "model-task"})
/*     */   public static final class Grazie { @NotNull
/*     */     public static final Grazie INSTANCE = new Grazie(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Grazie$Default;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Default implements TaskTagDescriptor.Stable { @NotNull
/*  61 */       public static final Default INSTANCE = new Default(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default"); @NotNull public TaskTag getTag() { return tag; }
/*     */        }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Grazie$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "model-task"})
/*     */     public static final class Schema implements TaskSchemaDescriptor { @NotNull
/*  65 */       public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/*  66 */       private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */       
/*     */       @NotNull
/*  69 */       public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = text; arrayOfText[1] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Grazie$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @NotNull private final String lang; @NotNull
/*     */       private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Grazie$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Grazie$Params;", "model-task"})
/*     */       public static final class Companion { private Companion() {} @NotNull
/*  72 */         public final KSerializer<TextTranslateTask.LLM.Grazie.Params> serializer() { return (KSerializer<TextTranslateTask.LLM.Grazie.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */          }
/*  74 */       public Params(@NotNull String text, @NotNull String lang) { this.text = text; this.lang = lang;
/*  75 */         this.attributes = Attributes.Companion.build(new TextTranslateTask$LLM$Grazie$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*  76 */       static final class TextTranslateTask$LLM$Grazie$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextTranslateTask.LLM.Grazie.Params.this.getText());
/*  77 */           $this$build.text("lang", TextTranslateTask.LLM.Grazie.Params.this.getLang()); }
/*     */          TextTranslateTask$LLM$Grazie$Params$attributes$1() {
/*     */           super(1);
/*     */         } } } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Youtrack;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "Schema", "model-task"})
/*     */   public static final class Youtrack implements TaskTagDescriptor.Stable { @NotNull
/*  83 */     public static final Youtrack INSTANCE = new Youtrack(); @NotNull private static final TaskTag tag = new TaskTag("llm-youtrack"); @NotNull public TaskTag getTag() { return tag; }
/*     */      @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Youtrack$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "model-task"})
/*     */     public static final class Schema implements TaskSchemaDescriptor { @NotNull
/*  86 */       public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/*  87 */       private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */       
/*     */       @NotNull
/*  90 */       public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = text; arrayOfText[1] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Youtrack$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @NotNull private final String lang; @NotNull
/*     */       private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Youtrack$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Youtrack$Params;", "model-task"})
/*     */       public static final class Companion { private Companion() {} @NotNull
/*  93 */         public final KSerializer<TextTranslateTask.LLM.Youtrack.Params> serializer() { return (KSerializer<TextTranslateTask.LLM.Youtrack.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */          }
/*  95 */       public Params(@NotNull String text, @NotNull String lang) { this.text = text; this.lang = lang;
/*  96 */         this.attributes = Attributes.Companion.build(new TextTranslateTask$LLM$Youtrack$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*  97 */       static final class TextTranslateTask$LLM$Youtrack$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextTranslateTask.LLM.Youtrack.Params.this.getText());
/*  98 */           $this$build.text("lang", TextTranslateTask.LLM.Youtrack.Params.this.getLang()); }
/*     */          TextTranslateTask$LLM$Youtrack$Params$attributes$1() {
/*     */           super(1);
/*     */         } } } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "Schema", "model-task"})
/*     */   public static final class Crowdin implements TaskTagDescriptor.Stable { @NotNull
/* 104 */     public static final Crowdin INSTANCE = new Crowdin(); @NotNull private static final TaskTag tag = new TaskTag("llm-crowdin-default"); @NotNull public TaskTag getTag() { return tag; }
/*     */      @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "model-task"})
/*     */     public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 107 */       public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/* 108 */       private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */       
/*     */       @NotNull
/* 111 */       public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = text; arrayOfText[1] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\000 \0272\0020\001:\001\027B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\035\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\030"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @NotNull private final String lang; @NotNull
/*     */       private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Params;", "model-task"})
/*     */       public static final class Companion { private Companion() {} @NotNull
/* 114 */         public final KSerializer<TextTranslateTask.LLM.Crowdin.Params> serializer() { return (KSerializer<TextTranslateTask.LLM.Crowdin.Params>)TaskParameters.Serializer.INSTANCE; } }
/* 115 */       public Params(@NotNull String text, @NotNull String lang) { this.text = text; this.lang = lang;
/* 116 */         this.attributes = Attributes.Companion.build(new TextTranslateTask$LLM$Crowdin$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public final String getLang() { return this.lang; } @NotNull public final String component1() { return this.text; } @NotNull public final String component2() { return this.lang; } @NotNull public final Params copy(@NotNull String text, @NotNull String lang) { Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new Params(text, lang); } @NotNull public Attributes getAttributes() { return this.attributes; } @NotNull public String toString() { return "Params(text=" + this.text + ", lang=" + this.lang + ")"; } public int hashCode() { result = this.text.hashCode(); return result * 31 + this.lang.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Params)) return false;  Params params = (Params)other; return !Intrinsics.areEqual(this.text, params.text) ? false : (!!Intrinsics.areEqual(this.lang, params.lang)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"}) static final class TextTranslateTask$LLM$Crowdin$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> {
/* 117 */         public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextTranslateTask.LLM.Crowdin.Params.this.getText());
/* 118 */           $this$build.text("lang", TextTranslateTask.LLM.Crowdin.Params.this.getLang()); }
/*     */ 
/*     */         
/*     */         TextTranslateTask$LLM$Crowdin$Params$attributes$1() {
/*     */           super(1);
/*     */         }
/*     */       } }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextTranslateTask$LLM.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */