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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\003\002\003\004\001\003\005\006\007ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/api/gateway/client/ResolutionResult;", "", "Failure", "FallbackUrl", "Success", "Lai/grazie/api/gateway/client/ResolutionResult$Failure;", "Lai/grazie/api/gateway/client/ResolutionResult$FallbackUrl;", "Lai/grazie/api/gateway/client/ResolutionResult$Success;", "api-gateway-client"})
/*    */ public interface ResolutionResult
/*    */ {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/api/gateway/client/ResolutionResult$Success;", "Lai/grazie/api/gateway/client/ResolutionResult;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api-gateway-client"})
/*    */   public static final class Success
/*    */     implements ResolutionResult
/*    */   {
/*    */     @NotNull
/*    */     private final String url;
/*    */     
/*    */     public Success(@NotNull String url) {
/* 54 */       this.url = url; } @NotNull public final String getUrl() { return this.url; } @NotNull public final String component1() { return this.url; } @NotNull public final Success copy(@NotNull String url) { Intrinsics.checkNotNullParameter(url, "url"); return new Success(url); } @NotNull public String toString() { return "Success(url=" + this.url + ")"; } public int hashCode() { return this.url.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.url, success.url); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\020\003\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\t\020\f\032\0020\003HÆ\003J\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J#\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/ResolutionResult$FallbackUrl;", "Lai/grazie/api/gateway/client/ResolutionResult;", "url", "", "problems", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "getProblems", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api-gateway-client"}) public static final class FallbackUrl implements ResolutionResult { @NotNull private final String url; @NotNull private final List<Throwable> problems;
/* 55 */     public FallbackUrl(@NotNull String url, @NotNull List<Throwable> problems) { this.url = url; this.problems = problems; } @NotNull public final String getUrl() { return this.url; } @NotNull public final List<Throwable> getProblems() { return this.problems; } @NotNull public final String component1() { return this.url; } @NotNull public final List<Throwable> component2() { return this.problems; } @NotNull public final FallbackUrl copy(@NotNull String url, @NotNull List<? extends Throwable> problems) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(problems, "problems"); return new FallbackUrl(url, problems); } @NotNull public String toString() { return "FallbackUrl(url=" + this.url + ", problems=" + this.problems + ")"; } public int hashCode() { result = this.url.hashCode(); return result * 31 + this.problems.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FallbackUrl)) return false;  FallbackUrl fallbackUrl = (FallbackUrl)other; return !Intrinsics.areEqual(this.url, fallbackUrl.url) ? false : (!!Intrinsics.areEqual(this.problems, fallbackUrl.problems)); } }
/* 56 */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\003\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/api/gateway/client/ResolutionResult$Failure;", "Lai/grazie/api/gateway/client/ResolutionResult;", "problems", "", "", "(Ljava/util/List;)V", "getProblems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api-gateway-client"}) public static final class Failure implements ResolutionResult { public Failure(@NotNull List<Throwable> problems) { this.problems = problems; } @NotNull private final List<Throwable> problems; @NotNull public final List<Throwable> getProblems() { return this.problems; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final List<Throwable> component1() {
/*    */       return this.problems;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Failure copy(@NotNull List<? extends Throwable> problems) {
/*    */       Intrinsics.checkNotNullParameter(problems, "problems");
/*    */       return new Failure(problems);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Failure(problems=" + this.problems + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.problems.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Failure))
/*    */         return false; 
/*    */       Failure failure = (Failure)other;
/*    */       return !!Intrinsics.areEqual(this.problems, failure.problems);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\ResolutionResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */