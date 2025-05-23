/*     */ package ai.grazie.model.task.library.text;
/*     */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*     */ import ai.grazie.model.task.id.TaskTag;
/*     */ import ai.grazie.model.task.id.TaskTagDescriptor;
/*     */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Deprecated(message = "Replace with V2 task descriptor")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\t\bÇ\002\030\0002\0020\001:\001\022B\007\b\002¢\006\002\020\002J\026\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nJ\026\020\f\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nJ\026\020\r\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nJ\026\020\016\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nJ\026\020\017\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nJ\026\020\020\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nJ\026\020\021\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\023"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "elaborate", "Lai/grazie/model/task/exec/TaskCall;", "text", "", "lang", "makeEngaging", "readability", "refine", "shorten", "simplify", "soundNatural", "LLM", "model-task"})
/*     */ public final class TextImproveTask implements TaskNameDescriptor {
/*     */   @NotNull
/*  14 */   public static final TextImproveTask INSTANCE = new TextImproveTask(); @NotNull private static final TaskName name = new TaskName("text-improve"); @NotNull public TaskName getName() { return name; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall elaborate(@NotNull String text, @NotNull String lang)
/*     */   {
/*  24 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.Elaborate.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$elaborate$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*  25 */   static final class TextImproveTask$elaborate$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/*  26 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); }
/*     */ 
/*     */ 
/*     */     
/*     */     TextImproveTask$elaborate$1(String $text, String $lang) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall makeEngaging(@NotNull String text, @NotNull String lang)
/*     */   {
/*  38 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.MakeEngaging.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$makeEngaging$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*  39 */   static final class TextImproveTask$makeEngaging$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/*  40 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); }
/*     */ 
/*     */ 
/*     */     
/*     */     TextImproveTask$makeEngaging$1(String $text, String $lang) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall simplify(@NotNull String text, @NotNull String lang)
/*     */   {
/*  52 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.Simplify.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$simplify$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*  53 */   static final class TextImproveTask$simplify$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/*  54 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); }
/*     */ 
/*     */ 
/*     */     
/*     */     TextImproveTask$simplify$1(String $text, String $lang) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall soundNatural(@NotNull String text, @NotNull String lang)
/*     */   {
/*  66 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.SoundNatural.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$soundNatural$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*  67 */   static final class TextImproveTask$soundNatural$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/*  68 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); }
/*     */ 
/*     */ 
/*     */     
/*     */     TextImproveTask$soundNatural$1(String $text, String $lang) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall shorten(@NotNull String text, @NotNull String lang)
/*     */   {
/*  80 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.Shorten.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$shorten$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*  81 */   static final class TextImproveTask$shorten$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/*  82 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); }
/*     */ 
/*     */ 
/*     */     
/*     */     TextImproveTask$shorten$1(String $text, String $lang) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall readability(@NotNull String text, @NotNull String lang)
/*     */   {
/*  94 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.Readability.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$readability$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/*  95 */   static final class TextImproveTask$readability$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/*  96 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); }
/*     */ 
/*     */ 
/*     */     
/*     */     TextImproveTask$readability$1(String $text, String $lang) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskCall refine(@NotNull String text, @NotNull String lang)
/*     */   {
/* 108 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(LLM.Grazie.Default.Refine.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveTask$refine$1(text, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 109 */   static final class TextImproveTask$refine$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getText(), this.$text);
/* 110 */       $this$build.add((AttributeDescriptor)TextImproveTask.LLM.Grazie.Schema.INSTANCE.getLang(), this.$lang); } TextImproveTask$refine$1(String $text, String $lang) { super(1); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM;", "", "()V", "Grazie", "Youtrack", "model-task"}) public static final class LLM { @NotNull
/*     */     public static final LLM INSTANCE = new LLM(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie;", "", "()V", "Default", "Params", "Schema", "model-task"})
/*     */     public static final class Grazie { @NotNull
/*     */       public static final Grazie INSTANCE = new Grazie(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\t\bÆ\002\030\0002\0020\001:\007\003\004\005\006\007\b\tB\007\b\002¢\006\002\020\002¨\006\n"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default;", "", "()V", "Elaborate", "MakeEngaging", "Readability", "Refine", "Shorten", "Simplify", "SoundNatural", "model-task"})
/*     */       public static final class Default { @NotNull
/*     */         public static final Default INSTANCE = new Default();
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Elaborate;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class Elaborate implements TaskTagDescriptor.Stable { @NotNull
/* 118 */           public static final Elaborate INSTANCE = new Elaborate(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-elaborate"); @NotNull public TaskTag getTag() { return tag; }
/*     */            }
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$MakeEngaging;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class MakeEngaging implements TaskTagDescriptor.Stable { @NotNull
/* 122 */           public static final MakeEngaging INSTANCE = new MakeEngaging(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-make-engaging"); @NotNull public TaskTag getTag() { return tag; }
/*     */            }
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Simplify;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class Simplify implements TaskTagDescriptor.Stable { @NotNull
/* 126 */           public static final Simplify INSTANCE = new Simplify(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-simplify"); @NotNull public TaskTag getTag() { return tag; }
/*     */            }
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$SoundNatural;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class SoundNatural implements TaskTagDescriptor.Stable { @NotNull
/* 130 */           public static final SoundNatural INSTANCE = new SoundNatural(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-sound-natural"); @NotNull public TaskTag getTag() { return tag; }
/*     */            }
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Shorten;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class Shorten implements TaskTagDescriptor.Stable { @NotNull
/* 134 */           public static final Shorten INSTANCE = new Shorten(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-shorten"); @NotNull public TaskTag getTag() { return tag; }
/*     */            }
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Readability;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class Readability implements TaskTagDescriptor.Stable { @NotNull
/* 138 */           public static final Readability INSTANCE = new Readability(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-readability"); @NotNull public TaskTag getTag() { return tag; }
/*     */            }
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Refine;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */         public static final class Refine implements TaskTagDescriptor.Stable { @NotNull
/* 142 */           public static final Refine INSTANCE = new Refine(); @NotNull private static final TaskTag tag = new TaskTag("llm-grazie-default-refine"); @NotNull public TaskTag getTag() { return tag; }
/*     */            } }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "model-task"})
/*     */       public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 147 */         public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/* 148 */         private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */         
/*     */         @NotNull
/* 151 */         public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = text; arrayOfText[1] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @NotNull private final String lang; @NotNull
/*     */         private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Params;", "model-task"})
/*     */         public static final class Companion { @NotNull
/* 154 */           public final KSerializer<TextImproveTask.LLM.Grazie.Params> serializer() { return (KSerializer<TextImproveTask.LLM.Grazie.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */            private Companion() {} } public Params(@NotNull String text, @NotNull String lang) {
/* 156 */           this.text = text; this.lang = lang;
/* 157 */           this.attributes = Attributes.Companion.build(new TextImproveTask$LLM$Grazie$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 158 */         static final class TextImproveTask$LLM$Grazie$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextImproveTask.LLM.Grazie.Params.this.getText());
/* 159 */             $this$build.text("lang", TextImproveTask.LLM.Grazie.Params.this.getLang()); }
/*     */            TextImproveTask$LLM$Grazie$Params$attributes$1() {
/*     */             super(1);
/*     */           } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Youtrack;", "", "()V", "FixGrammarAndSpelling", "Params", "Schema", "model-task"})
/*     */     public static final class Youtrack { @NotNull
/*     */       public static final Youtrack INSTANCE = new Youtrack(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Youtrack$FixGrammarAndSpelling;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class FixGrammarAndSpelling implements TaskTagDescriptor.Stable { @NotNull
/* 166 */         public static final FixGrammarAndSpelling INSTANCE = new FixGrammarAndSpelling(); @NotNull private static final TaskTag tag = new TaskTag("llm-youtrack-fix-grammar-and-spelling"); @NotNull public TaskTag getTag() { return tag; }
/*     */          }
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Youtrack$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "text", "getText", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "model-task"})
/*     */       public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 170 */         public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; }
/*     */         
/*     */         @NotNull
/* 173 */         private static final List<AttributeDescriptor.Text> all = CollectionsKt.listOf(text); @NotNull public List<AttributeDescriptor.Text> getAll() { return all; } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\006\b\007\030\000 \0132\0020\001:\001\013B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\f"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Youtrack$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "(Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getText", "()Ljava/lang/String;", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String text; @NotNull
/*     */         private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Youtrack$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextImproveTask$LLM$Youtrack$Params;", "model-task"})
/*     */         public static final class Companion { private Companion() {} @NotNull
/* 176 */           public final KSerializer<TextImproveTask.LLM.Youtrack.Params> serializer() { return (KSerializer<TextImproveTask.LLM.Youtrack.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */            }
/* 178 */         public Params(@NotNull String text) { this.text = text;
/* 179 */           this.attributes = Attributes.Companion.build(new TextImproveTask$LLM$Youtrack$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 180 */         static final class TextImproveTask$LLM$Youtrack$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextImproveTask.LLM.Youtrack.Params.this.getText()); }
/*     */ 
/*     */           
/*     */           TextImproveTask$LLM$Youtrack$Params$attributes$1() {
/*     */             super(1);
/*     */           } }
/*     */          }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie;", "", "()V", "Default", "Params", "Schema", "model-task"})
/*     */   public static final class Grazie {
/*     */     @NotNull
/*     */     public static final Grazie INSTANCE = new Grazie();
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\t\bÆ\002\030\0002\0020\001:\007\003\004\005\006\007\b\tB\007\b\002¢\006\002\020\002¨\006\n"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default;", "", "()V", "Elaborate", "MakeEngaging", "Readability", "Refine", "Shorten", "Simplify", "SoundNatural", "model-task"})
/*     */     public static final class Default {
/*     */       @NotNull
/*     */       public static final Default INSTANCE = new Default();
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Elaborate;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class Elaborate implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final Elaborate INSTANCE = new Elaborate();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-elaborate");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$MakeEngaging;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class MakeEngaging implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final MakeEngaging INSTANCE = new MakeEngaging();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-make-engaging");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Simplify;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class Simplify implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final Simplify INSTANCE = new Simplify();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-simplify");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$SoundNatural;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class SoundNatural implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final SoundNatural INSTANCE = new SoundNatural();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-sound-natural");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Shorten;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class Shorten implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final Shorten INSTANCE = new Shorten();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-shorten");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Readability;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class Readability implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final Readability INSTANCE = new Readability();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-readability");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Refine;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */       public static final class Refine implements TaskTagDescriptor.Stable {
/*     */         @NotNull
/*     */         public static final Refine INSTANCE = new Refine();
/*     */         @NotNull
/*     */         private static final TaskTag tag = new TaskTag("llm-grazie-default-refine");
/*     */         
/*     */         @NotNull
/*     */         public TaskTag getTag() {
/*     */           return tag;
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "model-task"})
/*     */     public static final class Schema implements TaskSchemaDescriptor {
/*     */       @NotNull
/*     */       public static final Schema INSTANCE = new Schema();
/*     */       @NotNull
/*     */       private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text");
/*     */       
/*     */       @NotNull
/*     */       public final AttributeDescriptor.Text getText() {
/*     */         return text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang");
/*     */       @NotNull
/*     */       private static final List<AttributeDescriptor.Text> all;
/*     */       
/*     */       @NotNull
/*     */       public final AttributeDescriptor.Text getLang() {
/*     */         return lang;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public List<AttributeDescriptor.Text> getAll() {
/*     */         return all;
/*     */       }
/*     */       
/*     */       static {
/*     */         AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2];
/*     */         arrayOfText[0] = text;
/*     */         arrayOfText[1] = lang;
/*     */         all = CollectionsKt.listOf((Object[])arrayOfText);
/*     */       }
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Use schema with task builder")
/*     */     @Serializable(with = TaskParameters.Serializer.class)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "Companion", "model-task"})
/*     */     public static final class Params extends TaskParameters {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final String text;
/*     */       @NotNull
/*     */       private final String lang;
/*     */       @NotNull
/*     */       private final Attributes attributes;
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Params;", "model-task"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<TextImproveTask.LLM.Grazie.Params> serializer() {
/*     */           return (KSerializer<TextImproveTask.LLM.Grazie.Params>)TaskParameters.Serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       public Params(@NotNull String text, @NotNull String lang) {
/*     */         this.text = text;
/*     */         this.lang = lang;
/*     */         this.attributes = Attributes.Companion.build(new TextImproveTask$LLM$Grazie$Params$attributes$1());
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getText() {
/*     */         return this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getLang() {
/*     */         return this.lang;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public Attributes getAttributes() {
/*     */         return this.attributes;
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/*     */       static final class TextImproveTask$LLM$Grazie$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> {
/*     */         public final void invoke(AttributesBuilder $this$build) {
/*     */           Intrinsics.checkNotNullParameter($this$build, "$this$build");
/*     */           $this$build.text("text", TextImproveTask.LLM.Grazie.Params.this.getText());
/*     */           $this$build.text("lang", TextImproveTask.LLM.Grazie.Params.this.getLang());
/*     */         }
/*     */         
/*     */         TextImproveTask$LLM$Grazie$Params$attributes$1() {
/*     */           super(1);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\t\bÆ\002\030\0002\0020\001:\007\003\004\005\006\007\b\tB\007\b\002¢\006\002\020\002¨\006\n"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default;", "", "()V", "Elaborate", "MakeEngaging", "Readability", "Refine", "Shorten", "Simplify", "SoundNatural", "model-task"})
/*     */   public static final class Default {
/*     */     @NotNull
/*     */     public static final Default INSTANCE = new Default();
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Elaborate;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Elaborate implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final Elaborate INSTANCE = new Elaborate();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-elaborate");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$MakeEngaging;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class MakeEngaging implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final MakeEngaging INSTANCE = new MakeEngaging();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-make-engaging");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Simplify;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Simplify implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final Simplify INSTANCE = new Simplify();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-simplify");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$SoundNatural;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class SoundNatural implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final SoundNatural INSTANCE = new SoundNatural();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-sound-natural");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Shorten;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Shorten implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final Shorten INSTANCE = new Shorten();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-shorten");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Readability;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Readability implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final Readability INSTANCE = new Readability();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-readability");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Refine;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */     public static final class Refine implements TaskTagDescriptor.Stable {
/*     */       @NotNull
/*     */       public static final Refine INSTANCE = new Refine();
/*     */       @NotNull
/*     */       private static final TaskTag tag = new TaskTag("llm-grazie-default-refine");
/*     */       
/*     */       @NotNull
/*     */       public TaskTag getTag() {
/*     */         return tag;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Elaborate;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class Elaborate implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final Elaborate INSTANCE = new Elaborate();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-elaborate");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$MakeEngaging;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class MakeEngaging implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final MakeEngaging INSTANCE = new MakeEngaging();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-make-engaging");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Simplify;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class Simplify implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final Simplify INSTANCE = new Simplify();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-simplify");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$SoundNatural;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class SoundNatural implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final SoundNatural INSTANCE = new SoundNatural();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-sound-natural");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Shorten;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class Shorten implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final Shorten INSTANCE = new Shorten();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-shorten");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Readability;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class Readability implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final Readability INSTANCE = new Readability();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-readability");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/text/TextImproveTask$LLM$Grazie$Default$Refine;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*     */   public static final class Refine implements TaskTagDescriptor.Stable {
/*     */     @NotNull
/*     */     public static final Refine INSTANCE = new Refine();
/*     */     @NotNull
/*     */     private static final TaskTag tag = new TaskTag("llm-grazie-default-refine");
/*     */     
/*     */     @NotNull
/*     */     public TaskTag getTag() {
/*     */       return tag;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextImproveTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */