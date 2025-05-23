/*    */ package ai.grazie.model.llm.chat.function;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.caching.LLMCachePoint;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\000\n\002\020 \n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\005¢\006\002\020\002J\f\020\006\032\b\022\004\022\0020\0050\007J\037\020\b\032\0020\t2\027\020\n\032\023\022\004\022\0020\f\022\004\022\0020\t0\013¢\006\002\b\rJ\006\020\016\032\0020\017R\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionsBuilder;", "", "()V", "functions", "", "Lai/grazie/model/llm/chat/function/LLMFunction;", "build", "", "function", "", "block", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/function/LLMFunction$Builder;", "Lkotlin/ExtensionFunctionType;", "getCachingPoint", "Lai/grazie/model/llm/chat/caching/LLMCachePoint;", "model-llm"})
/*    */ public final class LLMFunctionsBuilder
/*    */ {
/*    */   @NotNull
/* 29 */   private final List<LLMFunction> functions = new ArrayList<>();
/*    */   
/*    */   public final void function(@NotNull Function1 block) {
/* 32 */     Intrinsics.checkNotNullParameter(block, "block"); List<LLMFunction> list = this.functions; LLMFunction.Builder builder = new LLMFunction.Builder(); block.invoke(builder); list.add(builder.build());
/*    */   }
/*    */   @NotNull
/*    */   public final LLMCachePoint getCachingPoint() {
/* 36 */     return new LLMCachePoint(this.functions.size());
/*    */   } @NotNull
/*    */   public final List<LLMFunction> build() {
/* 39 */     return this.functions;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\function\LLMFunctionsBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */