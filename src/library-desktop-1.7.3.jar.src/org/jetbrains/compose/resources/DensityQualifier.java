/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @InternalResourceApi
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\020\n\002\030\002\n\000\n\002\020\b\n\002\b\013\b\002\030\000 \0162\b\022\004\022\0020\0000\0012\0020\002:\001\016B\017\b\002\022\006\020\003\032\0020\004¢\006\002\020\005R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\r¨\006\017"}, d2 = {"Lorg/jetbrains/compose/resources/DensityQualifier;", "", "Lorg/jetbrains/compose/resources/Qualifier;", "dpi", "", "(Ljava/lang/String;II)V", "getDpi", "()I", "LDPI", "MDPI", "HDPI", "XHDPI", "XXHDPI", "XXXHDPI", "Companion", "library"})
/*    */ public enum DensityQualifier
/*    */   implements Qualifier
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   private final int dpi;
/*    */   
/*    */   DensityQualifier(int dpi) {
/*    */     this.dpi = dpi;
/*    */   }
/*    */   
/*    */   public final int getDpi() {
/*    */     return this.dpi;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static EnumEntries<DensityQualifier> getEntries() {
/*    */     return $ENTRIES;
/*    */   }
/*    */   
/* 63 */   LDPI(120),
/* 64 */   MDPI(160),
/* 65 */   HDPI(240),
/* 66 */   XHDPI(320),
/* 67 */   XXHDPI(480),
/* 68 */   XXXHDPI(640); static { Companion = new Companion(null); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\b\032\0020\t¨\006\n"}, d2 = {"Lorg/jetbrains/compose/resources/DensityQualifier$Companion;", "", "()V", "selectByDensity", "Lorg/jetbrains/compose/resources/DensityQualifier;", "density", "", "selectByValue", "dpi", "", "library"})
/*    */   public static final class Companion {
/*    */     @NotNull
/* 71 */     public final DensityQualifier selectByValue(int dpi) { return 
/* 72 */         (dpi <= DensityQualifier.LDPI.getDpi()) ? DensityQualifier.LDPI : (
/* 73 */         (dpi <= DensityQualifier.MDPI.getDpi()) ? DensityQualifier.MDPI : (
/* 74 */         (dpi <= DensityQualifier.HDPI.getDpi()) ? DensityQualifier.HDPI : (
/* 75 */         (dpi <= DensityQualifier.XHDPI.getDpi()) ? DensityQualifier.XHDPI : (
/* 76 */         (dpi <= DensityQualifier.XXHDPI.getDpi()) ? DensityQualifier.XXHDPI : 
/* 77 */         DensityQualifier.XXXHDPI)))); } private Companion() {} @NotNull
/*    */     public final DensityQualifier selectByDensity(float density) {
/* 79 */       return 
/* 80 */         (density <= 0.75D) ? DensityQualifier.LDPI : (
/* 81 */         (density <= 1.0D) ? DensityQualifier.MDPI : (
/* 82 */         (density <= 1.5D) ? DensityQualifier.HDPI : (
/* 83 */         (density <= 2.0D) ? DensityQualifier.XHDPI : (
/* 84 */         (density <= 3.0D) ? DensityQualifier.XXHDPI : 
/* 85 */         DensityQualifier.XXXHDPI))));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\DensityQualifier.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */