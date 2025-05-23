/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Landroidx/compose/runtime/OpaqueKey;", "", "key", "", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class OpaqueKey
/*    */ {
/*    */   @NotNull
/*    */   private final String key;
/*    */   public static final int $stable;
/*    */   
/*    */   public OpaqueKey(@NotNull String key) {
/* 23 */     this.key = key; } @NotNull public final String getKey() { return this.key; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpaqueKey copy(@NotNull String key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     return new OpaqueKey(key);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpaqueKey(key=" + this.key + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.key.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpaqueKey))
/*    */       return false; 
/*    */     OpaqueKey opaqueKey = (OpaqueKey)other;
/*    */     return !!Intrinsics.areEqual(this.key, opaqueKey.key);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\OpaqueKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */