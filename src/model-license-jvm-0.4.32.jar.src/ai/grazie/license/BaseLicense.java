/*    */ package ai.grazie.license;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\006\bg\030\0002\0020\001J\b\020\034\032\0020\003H\002R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\003X¦\004¢\006\006\032\004\b\013\020\005R\024\020\f\032\0020\0038VX\004¢\006\006\032\004\b\r\020\005R\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\020\020\021R\022\020\022\032\0020\003X¦\004¢\006\006\032\004\b\023\020\005R\024\020\024\032\004\030\0010\017X¦\004¢\006\006\032\004\b\025\020\021R\022\020\026\032\0020\027X¦\004¢\006\006\032\004\b\030\020\031R\024\020\032\032\0020\0038VX\004¢\006\006\032\004\b\033\020\005ø\001\000\002\006\n\004\b!0\001¨\006\035À\006\001"}, d2 = {"Lai/grazie/license/BaseLicense;", "", "cancelled", "", "getCancelled", "()Z", "licenseId", "Lai/grazie/license/LicenseID;", "getLicenseId", "()Lai/grazie/license/LicenseID;", "outdated", "getOutdated", "perpetual", "getPerpetual", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "getSince", "()Lai/grazie/utils/mpp/time/Timestamp;", "suspended", "getSuspended", "till", "getTill", "type", "Lai/grazie/license/LicenseType;", "getType", "()Lai/grazie/license/LicenseType;", "valid", "getValid", "isTillValid", "model-license"})
/*    */ @SourceDebugExtension({"SMAP\nBaseLicense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseLicense.kt\nai/grazie/license/BaseLicense\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/*    */ public interface BaseLicense
/*    */ {
/*    */   @NotNull
/*    */   LicenseID getLicenseId();
/*    */   
/*    */   @NotNull
/*    */   LicenseType getType();
/*    */   
/*    */   @NotNull
/*    */   Timestamp getSince();
/*    */   
/*    */   default boolean getPerpetual() {
/* 29 */     return (getTill() == null);
/*    */   } @Nullable
/*    */   Timestamp getTill(); boolean getCancelled(); boolean getSuspended(); boolean getOutdated(); default boolean getValid() {
/* 32 */     return (!getCancelled() && 
/* 33 */       !getSuspended() && 
/* 34 */       !getOutdated() && 
/* 35 */       isTillValid());
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean isTillValid() {
/* 40 */     Timestamp it = getTill();
/*    */ 
/*    */     
/* 43 */     int $i$a$-let-BaseLicense$isTillValid$1 = 0;
/*    */     getTill();
/*    */     return (getTill() != null) ? ((Timestamp.Companion.now().compareTo(it) < 0)) : true;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\BaseLicense.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */