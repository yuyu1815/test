/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent$Plain;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelSingleMessageContent;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class Plain
/*    */   extends VelocityModelSingleMessageContent
/*    */ {
/*    */   @NotNull
/*    */   private final String value;
/*    */   
/*    */   public Plain(@NotNull String value) {
/* 38 */     super(null); this.value = value; } @NotNull public final String getValue() { return this.value; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Plain copy(@NotNull String value) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     return new Plain(value);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Plain(value=" + this.value + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.value.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Plain))
/*    */       return false; 
/*    */     Plain plain = (Plain)other;
/*    */     return !!Intrinsics.areEqual(this.value, plain.value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelSingleMessageContent$Plain.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */