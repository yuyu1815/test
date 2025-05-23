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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001:\002\007\bB\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket;", "Lai/grazie/model/task/id/TaskTagDescriptor$Stable;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "Params", "Schema", "model-task"})
/*     */ public final class Ticket
/*     */   implements TaskTagDescriptor.Stable
/*     */ {
/*     */   @NotNull
/* 106 */   public static final Ticket INSTANCE = new Ticket(); @NotNull private static final TaskTag tag = new TaskTag("llm-youtrack-ticket"); @NotNull public TaskTag getTag() { return tag; }
/*     */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\013\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "content", "getContent", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "lang", "getLang", "type", "getType", "model-task"})
/*     */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 109 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text content = new AttributeDescriptor.Text("content"); @NotNull public final AttributeDescriptor.Text getContent() { return content; } @NotNull
/* 110 */     private static final AttributeDescriptor.Text type = new AttributeDescriptor.Text("type"); @NotNull public final AttributeDescriptor.Text getType() { return type; } @NotNull
/* 111 */     private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*     */     
/*     */     @NotNull
/* 114 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[3]; arrayOfText[0] = content; arrayOfText[1] = type; arrayOfText[2] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); } } @Deprecated(message = "Use schema with task builder") @Serializable(with = TaskParameters.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\b\b\007\030\000 \0172\0020\001:\001\017B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\f¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "content", "", "type", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getContent", "()Ljava/lang/String;", "getLang", "getType", "Companion", "model-task"}) public static final class Params extends TaskParameters { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String content; @NotNull private final String type; @NotNull private final String lang; @NotNull
/*     */     private final Attributes attributes; @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params;", "model-task"})
/*     */     public static final class Companion { @NotNull
/* 117 */       public final KSerializer<TextSummarizeTask.LLM.Youtrack.Ticket.Params> serializer() { return (KSerializer<TextSummarizeTask.LLM.Youtrack.Ticket.Params>)TaskParameters.Serializer.INSTANCE; }
/*     */        private Companion() {} } public Params(@NotNull String content, @NotNull String type, @NotNull String lang) {
/* 119 */       this.content = content; this.type = type; this.lang = lang;
/* 120 */       this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1()); } @NotNull public final String getContent() { return this.content; } @NotNull public final String getType() { return this.type; } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 121 */     static final class TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("type", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getType());
/* 122 */         $this$build.text("content", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getContent());
/* 123 */         $this$build.text("lang", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getLang()); }
/*     */ 
/*     */       
/*     */       TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1() {
/*     */         super(1);
/*     */       } }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextSummarizeTask$LLM$Youtrack$Ticket.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */