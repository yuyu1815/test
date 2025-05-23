/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\013\020\r\032\004\030\0010\005HÆ\003J\037\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;", "", "chain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;", "prettyDate", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;Ljava/lang/String;)V", "getChain", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;", "getPrettyDate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class SortedRecentTaskChain
/*     */ {
/*     */   @NotNull
/*     */   private final RecentTaskChain chain;
/*     */   @Nullable
/*     */   private final String prettyDate;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public SortedRecentTaskChain(@NotNull RecentTaskChain chain, @Nullable String prettyDate) {
/* 288 */     this.chain = chain; this.prettyDate = prettyDate; } @NotNull public final RecentTaskChain getChain() { return this.chain; } @Nullable public final String getPrettyDate() { return this.prettyDate; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final RecentTaskChain component1() {
/*     */     return this.chain;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.prettyDate;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SortedRecentTaskChain copy(@NotNull RecentTaskChain chain, @Nullable String prettyDate) {
/*     */     Intrinsics.checkNotNullParameter(chain, "chain");
/*     */     return new SortedRecentTaskChain(chain, prettyDate);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "SortedRecentTaskChain(chain=" + this.chain + ", prettyDate=" + this.prettyDate + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.chain.hashCode();
/*     */     return result * 31 + ((this.prettyDate == null) ? 0 : this.prettyDate.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof SortedRecentTaskChain))
/*     */       return false; 
/*     */     SortedRecentTaskChain sortedRecentTaskChain = (SortedRecentTaskChain)other;
/*     */     return !Intrinsics.areEqual(this.chain, sortedRecentTaskChain.chain) ? false : (!!Intrinsics.areEqual(this.prettyDate, sortedRecentTaskChain.prettyDate));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\SortedRecentTaskChain.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */