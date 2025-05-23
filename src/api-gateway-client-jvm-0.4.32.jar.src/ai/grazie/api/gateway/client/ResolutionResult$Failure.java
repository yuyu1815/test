/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import java.util.List;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\003\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/api/gateway/client/ResolutionResult$Failure;", "Lai/grazie/api/gateway/client/ResolutionResult;", "problems", "", "", "(Ljava/util/List;)V", "getProblems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api-gateway-client"})
/*    */ public final class Failure
/*    */   implements ResolutionResult
/*    */ {
/*    */   @NotNull
/*    */   private final List<Throwable> problems;
/*    */   
/*    */   public Failure(@NotNull List<Throwable> problems) {
/* 56 */     this.problems = problems; } @NotNull public final List<Throwable> getProblems() { return this.problems; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<Throwable> component1() {
/*    */     return this.problems;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Failure copy(@NotNull List<? extends Throwable> problems) {
/*    */     Intrinsics.checkNotNullParameter(problems, "problems");
/*    */     return new Failure(problems);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Failure(problems=" + this.problems + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.problems.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Failure))
/*    */       return false; 
/*    */     Failure failure = (Failure)other;
/*    */     return !!Intrinsics.areEqual(this.problems, failure.problems);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\ResolutionResult$Failure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */