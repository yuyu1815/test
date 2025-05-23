/*    */ package org.jetbrains.compose.resources;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @InternalResourceApi
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lorg/jetbrains/compose/resources/RegionQualifier;", "Lorg/jetbrains/compose/resources/Qualifier;", "region", "", "(Ljava/lang/String;)V", "getRegion", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "library"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class RegionQualifier
/*    */   implements Qualifier
/*    */ {
/*    */   @NotNull
/*    */   private final String region;
/*    */   public static final int $stable;
/*    */   
/*    */   public RegionQualifier(@NotNull String region) {
/* 29 */     this.region = region; } @NotNull public final String getRegion() { return this.region; }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 32 */     if (this == other) return true; 
/* 33 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 35 */     (RegionQualifier)other;
/*    */     
/* 37 */     return Intrinsics.areEqual(this.region, ((RegionQualifier)other).region);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 41 */     return this.region.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 45 */     return "RegionQualifier(region='" + this.region + "')";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\RegionQualifier.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */