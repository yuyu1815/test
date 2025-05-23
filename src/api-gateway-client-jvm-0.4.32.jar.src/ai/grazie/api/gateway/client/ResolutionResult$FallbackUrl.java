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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\020\003\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\007J\t\020\f\032\0020\003HÆ\003J\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J#\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/ResolutionResult$FallbackUrl;", "Lai/grazie/api/gateway/client/ResolutionResult;", "url", "", "problems", "", "", "(Ljava/lang/String;Ljava/util/List;)V", "getProblems", "()Ljava/util/List;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api-gateway-client"})
/*    */ public final class FallbackUrl
/*    */   implements ResolutionResult
/*    */ {
/*    */   @NotNull
/*    */   private final String url;
/*    */   @NotNull
/*    */   private final List<Throwable> problems;
/*    */   
/*    */   public FallbackUrl(@NotNull String url, @NotNull List<Throwable> problems) {
/* 55 */     this.url = url; this.problems = problems; } @NotNull public final String getUrl() { return this.url; } @NotNull public final List<Throwable> getProblems() { return this.problems; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.url;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Throwable> component2() {
/*    */     return this.problems;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FallbackUrl copy(@NotNull String url, @NotNull List<? extends Throwable> problems) {
/*    */     Intrinsics.checkNotNullParameter(url, "url");
/*    */     Intrinsics.checkNotNullParameter(problems, "problems");
/*    */     return new FallbackUrl(url, problems);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FallbackUrl(url=" + this.url + ", problems=" + this.problems + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.url.hashCode();
/*    */     return result * 31 + this.problems.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FallbackUrl))
/*    */       return false; 
/*    */     FallbackUrl fallbackUrl = (FallbackUrl)other;
/*    */     return !Intrinsics.areEqual(this.url, fallbackUrl.url) ? false : (!!Intrinsics.areEqual(this.problems, fallbackUrl.problems));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\ResolutionResult$FallbackUrl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */