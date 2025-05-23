/*    */ package ai.grazie.model.task.library.text;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParameters;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.attributes.AttributesBuilder;
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
/*    */ @Serializable(with = TaskParameters.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\b\007\030\000 \r2\0020\001:\001\rB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "Companion", "model-task"})
/*    */ public final class Params
/*    */   extends TaskParameters
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final String lang;
/*    */   @NotNull
/*    */   private final Attributes attributes;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Basic$Params;", "model-task"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TextTranslateTask.LLM.Basic.Params> serializer() {
/* 50 */       return (KSerializer<TextTranslateTask.LLM.Basic.Params>)TaskParameters.Serializer.INSTANCE;
/* 51 */     } } @NotNull public final String getText() { return this.text; } public Params(@NotNull String text, @NotNull String lang) { this.text = text; this.lang = lang;
/* 52 */     this.attributes = Attributes.Companion.build(new TextTranslateTask$LLM$Basic$Params$attributes$1()); } @NotNull public final String getLang() { return this.lang; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 53 */   static final class TextTranslateTask$LLM$Basic$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextTranslateTask.LLM.Basic.Params.this.getText());
/* 54 */       $this$build.text("lang", TextTranslateTask.LLM.Basic.Params.this.getLang()); }
/*    */ 
/*    */     
/*    */     TextTranslateTask$LLM$Basic$Params$attributes$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextTranslateTask$LLM$Basic$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */