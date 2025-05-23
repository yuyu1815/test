/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\005HÖ\001J\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger$VcsState;", "", "originUrl", "", "usersCount", "", "localChangedFiles", "<init>", "(Ljava/lang/String;II)V", "getOriginUrl", "()Ljava/lang/String;", "getUsersCount", "()I", "getLocalChangedFiles", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class VcsState
/*    */ {
/*    */   @NotNull
/*    */   private final String originUrl;
/*    */   private final int usersCount;
/*    */   private final int localChangedFiles;
/*    */   
/*    */   public VcsState(@NotNull String originUrl, int usersCount, int localChangedFiles) {
/* 51 */     this.originUrl = originUrl; this.usersCount = usersCount; this.localChangedFiles = localChangedFiles; } @NotNull public final String getOriginUrl() { return this.originUrl; } public final int getUsersCount() { return this.usersCount; } public final int getLocalChangedFiles() { return this.localChangedFiles; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.originUrl;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.usersCount;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.localChangedFiles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VcsState copy(@NotNull String originUrl, int usersCount, int localChangedFiles) {
/*    */     Intrinsics.checkNotNullParameter(originUrl, "originUrl");
/*    */     return new VcsState(originUrl, usersCount, localChangedFiles);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VcsState(originUrl=" + this.originUrl + ", usersCount=" + this.usersCount + ", localChangedFiles=" + this.localChangedFiles + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.originUrl.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.usersCount);
/*    */     return result * 31 + Integer.hashCode(this.localChangedFiles);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VcsState))
/*    */       return false; 
/*    */     VcsState vcsState = (VcsState)other;
/*    */     return !Intrinsics.areEqual(this.originUrl, vcsState.originUrl) ? false : ((this.usersCount != vcsState.usersCount) ? false : (!(this.localChangedFiles != vcsState.localChangedFiles)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\AbstractEJVcsStateLogger$VcsState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */