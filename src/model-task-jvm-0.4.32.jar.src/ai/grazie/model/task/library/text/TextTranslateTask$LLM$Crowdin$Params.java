/*     */ package ai.grazie.model.task.library.text;
/*     */ 
/*     */ import ai.grazie.model.task.exec.TaskParameters;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.AttributesBuilder;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
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
/*     */ @Serializable(with = TaskParameters.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\000 \0272\0020\001:\001\027B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\035\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\030"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "text", "", "lang", "(Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getLang", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "model-task"})
/*     */ public final class Params
/*     */   extends TaskParameters
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private final String lang;
/*     */   @NotNull
/*     */   private final Attributes attributes;
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextTranslateTask$LLM$Crowdin$Params;", "model-task"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<TextTranslateTask.LLM.Crowdin.Params> serializer() {
/* 114 */       return (KSerializer<TextTranslateTask.LLM.Crowdin.Params>)TaskParameters.Serializer.INSTANCE;
/* 115 */     } } public Params(@NotNull String text, @NotNull String lang) { this.text = text; this.lang = lang;
/* 116 */     this.attributes = Attributes.Companion.build(new TextTranslateTask$LLM$Crowdin$Params$attributes$1()); } @NotNull public final String getText() { return this.text; } @NotNull public final String getLang() { return this.lang; } @NotNull public final String component1() { return this.text; } @NotNull public final String component2() { return this.lang; } @NotNull public final Params copy(@NotNull String text, @NotNull String lang) { Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new Params(text, lang); } @NotNull public Attributes getAttributes() { return this.attributes; } @NotNull public String toString() { return "Params(text=" + this.text + ", lang=" + this.lang + ")"; } public int hashCode() { result = this.text.hashCode(); return result * 31 + this.lang.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Params)) return false;  Params params = (Params)other; return !Intrinsics.areEqual(this.text, params.text) ? false : (!!Intrinsics.areEqual(this.lang, params.lang)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"}) static final class TextTranslateTask$LLM$Crowdin$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> {
/* 117 */     public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("text", TextTranslateTask.LLM.Crowdin.Params.this.getText());
/* 118 */       $this$build.text("lang", TextTranslateTask.LLM.Crowdin.Params.this.getLang()); }
/*     */ 
/*     */     
/*     */     TextTranslateTask$LLM$Crowdin$Params$attributes$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextTranslateTask$LLM$Crowdin$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */