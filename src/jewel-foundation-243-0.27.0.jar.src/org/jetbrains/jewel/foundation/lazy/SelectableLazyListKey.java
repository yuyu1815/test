/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\f\rB\t\b\004¢\006\004\b\002\020\003J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026R\022\020\004\032\0020\001X¦\004¢\006\006\032\004\b\005\020\006\001\002\016\017¨\006\020"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "", "<init>", "()V", "key", "getKey", "()Ljava/lang/Object;", "equals", "", "other", "hashCode", "", "Selectable", "NotSelectable", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$NotSelectable;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable;", "foundation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class SelectableLazyListKey
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   private SelectableLazyListKey() {}
/*     */   
/*     */   @NotNull
/*     */   public abstract Object getKey();
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "key", "", "<init>", "(Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "foundation"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class Selectable
/*     */     extends SelectableLazyListKey
/*     */   {
/*     */     @NotNull
/*     */     private final Object key;
/*     */     public static final int $stable = 8;
/*     */     
/*     */     public Selectable(@NotNull Object key) {
/* 103 */       super(null); this.key = key; } @NotNull public Object getKey() { return this.key; }
/*     */   
/*     */   }
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$NotSelectable;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "key", "", "<init>", "(Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "foundation"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class NotSelectable extends SelectableLazyListKey { @NotNull
/*     */     private final Object key;
/* 110 */     public NotSelectable(@NotNull Object key) { super(null); this.key = key; } public static final int $stable = 8; @NotNull public Object getKey() { return this.key; }
/*     */      }
/*     */   public boolean equals(@Nullable Object other) {
/* 113 */     if (this == other) return true; 
/* 114 */     if (!Intrinsics.areEqual(getClass(), (other != null) ? other.getClass() : null)) return false;
/*     */     
/* 116 */     Intrinsics.checkNotNull(other, "null cannot be cast to non-null type org.jetbrains.jewel.foundation.lazy.SelectableLazyListKey"); (SelectableLazyListKey)other;
/*     */     
/* 118 */     return Intrinsics.areEqual(getKey(), ((SelectableLazyListKey)other).getKey());
/*     */   }
/*     */   public int hashCode() {
/* 121 */     return getKey().hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyListKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */