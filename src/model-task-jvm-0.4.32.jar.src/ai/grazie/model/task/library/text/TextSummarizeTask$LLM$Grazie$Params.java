/*    */ package ai.grazie.model.task.library.text;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParameters;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.attributes.AttributesBuilder;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "Use schema with task builder")
/*    */ @Serializable(with = TaskParameters.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\t\b\007\030\000 \0212\0020\001:\001\021B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003¢\006\002\020\007R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\n\020\013R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006\022"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "words", "", "lang", "(Ljava/lang/String;ILjava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "getWords", "()I", "Companion", "model-task"})
/*    */ public final class Params
/*    */   extends TaskParameters
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String text;
/*    */   private final int words;
/*    */   @NotNull
/*    */   private final String lang;
/*    */   @NotNull
/*    */   private final Attributes attributes;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextSummarizeTask$LLM$Grazie$Params;", "model-task"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TextSummarizeTask.LLM.Grazie.Params> serializer() {
/* 93 */       return (KSerializer<TextSummarizeTask.LLM.Grazie.Params>)TaskParameters.Serializer.INSTANCE;
/*    */     }
/* 95 */   } @NotNull public final String getText() { return this.text; } public final int getWords() { return this.words; } public Params(@NotNull String text, int words, @NotNull String lang) { this.text = text; this.words = words; this.lang = lang;
/* 96 */     this.attributes = Attributes.Companion.build(new TextSummarizeTask$LLM$Grazie$Params$attributes$1()); } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 97 */   static final class TextSummarizeTask$LLM$Grazie$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.int("words", TextSummarizeTask.LLM.Grazie.Params.this.getWords());
/* 98 */       $this$build.text("text", TextSummarizeTask.LLM.Grazie.Params.this.getText());
/* 99 */       $this$build.text("lang", TextSummarizeTask.LLM.Grazie.Params.this.getLang()); }
/*    */ 
/*    */     
/*    */     TextSummarizeTask$LLM$Grazie$Params$attributes$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextSummarizeTask$LLM$Grazie$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */