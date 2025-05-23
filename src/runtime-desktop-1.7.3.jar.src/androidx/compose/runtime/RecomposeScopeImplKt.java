/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.PublishedApi;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\b\n\002\b\007\n\002\030\002\n\002\b\006\032\020\020\r\032\0020\0012\006\020\016\032\0020\001H\001\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\tX\004¢\006\002\n\000\"\016\020\n\032\0020\001XT¢\006\002\n\000\"\016\020\013\032\0020\001XT¢\006\002\n\000\"\016\020\f\032\0020\001XT¢\006\002\n\000¨\006\017"}, d2 = {"DefaultsInScopeFlag", "", "DefaultsInvalidFlag", "ForcedRecomposeFlag", "RequiresRecomposeFlag", "RereadingFlag", "SkippedFlag", "UsedFlag", "callbackLock", "Landroidx/compose/runtime/SynchronizedObject;", "changedHighBitMask", "changedLowBitMask", "changedMask", "updateChangedFlags", "flags", "runtime"})
/*    */ public final class RecomposeScopeImplKt
/*    */ {
/*    */   private static final int changedLowBitMask = 306783378;
/*    */   private static final int changedHighBitMask = 613566756;
/*    */   private static final int changedMask = -920350135;
/*    */   private static final int UsedFlag = 1;
/*    */   private static final int DefaultsInScopeFlag = 2;
/*    */   private static final int DefaultsInvalidFlag = 4;
/*    */   private static final int RequiresRecomposeFlag = 8;
/*    */   private static final int SkippedFlag = 16;
/*    */   private static final int RereadingFlag = 32;
/*    */   private static final int ForcedRecomposeFlag = 64;
/*    */   
/*    */   @PublishedApi
/*    */   public static final int updateChangedFlags(int flags) {
/* 51 */     int lowBits = flags & 0x12492492;
/* 52 */     int highBits = flags & 0x24924924;
/* 53 */     return flags & 0xC9249249 | 
/* 54 */       lowBits | highBits >> 1 | lowBits << 1 & highBits;
/*    */   }
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
/*    */   @NotNull
/* 71 */   private static final SynchronizedObject callbackLock = new SynchronizedObject();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\RecomposeScopeImplKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */