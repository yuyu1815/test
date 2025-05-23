/*    */ package ai.grazie.model.llm.chat.function;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\b\n\002\030\002\n\002\b\005\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\006\020\022\032\0020\023R\034\020\003\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\005\020\006\"\004\b\007\020\bR\034\020\t\032\004\030\0010\004X\016¢\006\016\n\000\032\004\b\n\020\006\"\004\b\013\020\bR\034\020\f\032\004\030\0010\rX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006\024"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunction$Builder;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "name", "getName", "setName", "parameters", "Lai/grazie/model/llm/chat/function/LLMFunctionParameters;", "getParameters", "()Lai/grazie/model/llm/chat/function/LLMFunctionParameters;", "setParameters", "(Lai/grazie/model/llm/chat/function/LLMFunctionParameters;)V", "build", "Lai/grazie/model/llm/chat/function/LLMFunction;", "model-llm"})
/*    */ @SourceDebugExtension({"SMAP\nLLMFunction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMFunction.kt\nai/grazie/model/llm/chat/function/LLMFunction$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/*    */ public final class Builder {
/*    */   @Nullable
/*    */   private String name;
/*    */   
/*    */   @Nullable
/*    */   public final String getName() {
/* 16 */     return this.name; } @Nullable private String description; @Nullable private LLMFunctionParameters parameters; public final void setName(@Nullable String <set-?>) { this.name = <set-?>; } @Nullable
/* 17 */   public final String getDescription() { return this.description; } public final void setDescription(@Nullable String <set-?>) { this.description = <set-?>; } @Nullable
/* 18 */   public final LLMFunctionParameters getParameters() { return this.parameters; } public final void setParameters(@Nullable LLMFunctionParameters <set-?>) { this.parameters = <set-?>; } @NotNull
/*    */   public final LLMFunction build() {
/*    */     String str2;
/* 21 */     if (this.name == null) {
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
/* 42 */       int $i$a$-requireNotNull-LLMFunction$Builder$build$1 = 0;
/*    */       String str = "name is required";
/*    */       throw new IllegalArgumentException(str.toString());
/*    */     } 
/*    */     LLMFunctionParameters lLMFunctionParameters = this.parameters;
/*    */     String str1 = this.description;
/*    */     return new LLMFunction(str2, str1, lLMFunctionParameters);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\function\LLMFunction$Builder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */