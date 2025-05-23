/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.datetime.Clock;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\t\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\0020\002B\027\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\003\032\0028\000¢\006\004\b\006\020\bJ\016\020\016\032\0028\000HÆ\003¢\006\002\020\nJ\t\020\017\032\0020\005HÆ\003J(\020\020\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\0002\b\b\002\020\004\032\0020\005HÆ\001¢\006\002\020\021J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\002HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\030HÖ\001R\023\020\003\032\0028\000¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$WithTimestamp;", "T", "", "elem", "timestampMs", "", "<init>", "(Ljava/lang/Object;J)V", "(Ljava/lang/Object;)V", "getElem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTimestampMs", "()J", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$WithTimestamp;", "equals", "", "other", "hashCode", "", "toString", "", "core"})
/*     */ public final class WithTimestamp<T>
/*     */ {
/*     */   private final T elem;
/*     */   private final long timestampMs;
/*     */   
/*     */   public WithTimestamp(Object elem, long timestampMs) {
/* 103 */     this.elem = (T)elem; this.timestampMs = timestampMs; } public final T getElem() { return this.elem; } public final long getTimestampMs() { return this.timestampMs; } public WithTimestamp(Object elem) {
/* 104 */     this((T)elem, Clock.System.INSTANCE.now().toEpochMilliseconds());
/*     */   }
/*     */   
/*     */   public final T component1() {
/*     */     return this.elem;
/*     */   }
/*     */   
/*     */   public final long component2() {
/*     */     return this.timestampMs;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final WithTimestamp<T> copy(Object elem, long timestampMs) {
/*     */     return new WithTimestamp((T)elem, timestampMs);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "WithTimestamp(elem=" + this.elem + ", timestampMs=" + this.timestampMs + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.elem == null) ? 0 : this.elem.hashCode();
/*     */     return result * 31 + Long.hashCode(this.timestampMs);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof WithTimestamp))
/*     */       return false; 
/*     */     WithTimestamp withTimestamp = (WithTimestamp)other;
/*     */     return !Intrinsics.areEqual(this.elem, withTimestamp.elem) ? false : (!(this.timestampMs != withTimestamp.timestampMs));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextFileLoggingListener$WithTimestamp.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */