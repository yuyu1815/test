/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\001\022\b\020\003\032\004\030\0010\001¢\006\002\020\004J\013\020\b\032\004\030\0010\001HÆ\003J\013\020\t\032\004\030\0010\001HÆ\003J!\020\n\032\0020\0002\n\b\002\020\002\032\004\030\0010\0012\n\b\002\020\003\032\004\030\0010\001HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\001HÖ\003J\b\020\016\032\0020\017H\026J\022\020\020\032\0020\0172\b\020\021\032\004\030\0010\001H\002J\t\020\022\032\0020\023HÖ\001R\023\020\002\032\004\030\0010\001¢\006\b\n\000\032\004\b\005\020\006R\023\020\003\032\004\030\0010\001¢\006\b\n\000\032\004\b\007\020\006¨\006\024"}, d2 = {"Landroidx/compose/runtime/JoinedKey;", "", "left", "right", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getLeft", "()Ljava/lang/Object;", "getRight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "hashCodeOf", "value", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class JoinedKey {
/*    */   @Nullable
/*    */   private final Object left;
/*    */   @Nullable
/*    */   private final Object right;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @Nullable
/*    */   public final Object getLeft() {
/*    */     return this.left;
/*    */   }
/*    */   
/* 21 */   public JoinedKey(@Nullable Object left, @Nullable Object right) { this.left = left;
/* 22 */     this.right = right; } @Nullable public final Object getRight() { return this.right; }
/*    */    public int hashCode() {
/* 24 */     return hashCodeOf(this.left) * 31 + hashCodeOf(this.right);
/*    */   }
/*    */   private final int hashCodeOf(Object value) {
/* 27 */     return (value instanceof Enum) ? ((Enum)value).ordinal() : ((value != null) ? value.hashCode() : 0);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object component1() {
/*    */     return this.left;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object component2() {
/*    */     return this.right;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JoinedKey copy(@Nullable Object left, @Nullable Object right) {
/*    */     return new JoinedKey(left, right);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof JoinedKey))
/*    */       return false; 
/*    */     JoinedKey joinedKey = (JoinedKey)other;
/*    */     return !Intrinsics.areEqual(this.left, joinedKey.left) ? false : (!!Intrinsics.areEqual(this.right, joinedKey.right));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\JoinedKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */