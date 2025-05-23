/*     */ package ai.grazie.model.task.library.text;
/*     */ 
/*     */ import ai.grazie.model.task.exec.TaskParameters;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.AttributesBuilder;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
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
/*     */ @Deprecated(message = "Use schema with task builder")
/*     */ @Serializable(with = TaskParameters.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\b\b\007\030\000 \0172\0020\001:\001\017B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\f¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "content", "", "type", "lang", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getContent", "()Ljava/lang/String;", "getLang", "getType", "Companion", "model-task"})
/*     */ public final class Params
/*     */   extends TaskParameters
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String content;
/*     */   @NotNull
/*     */   private final String type;
/*     */   @NotNull
/*     */   private final String lang;
/*     */   @NotNull
/*     */   private final Attributes attributes;
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Youtrack$Ticket$Params;", "model-task"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<TextSummarizeTask.LLM.Youtrack.Ticket.Params> serializer() {
/* 117 */       return (KSerializer<TextSummarizeTask.LLM.Youtrack.Ticket.Params>)TaskParameters.Serializer.INSTANCE;
/*     */     }
/* 119 */   } @NotNull public final String getContent() { return this.content; } @NotNull public final String getType() { return this.type; } public Params(@NotNull String content, @NotNull String type, @NotNull String lang) { this.content = content; this.type = type; this.lang = lang;
/* 120 */     this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1()); } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 121 */   static final class TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("type", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getType());
/* 122 */       $this$build.text("content", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getContent());
/* 123 */       $this$build.text("lang", TextSummarizeTask.LLM.Youtrack.Ticket.Params.this.getLang()); }
/*     */ 
/*     */     
/*     */     TextSummarizeTask$LLM$Youtrack$Ticket$Params$attributes$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextSummarizeTask$LLM$Youtrack$Ticket$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */