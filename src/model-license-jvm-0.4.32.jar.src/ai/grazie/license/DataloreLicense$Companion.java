/*    */ package ai.grazie.license;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002JW\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\0062\006\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0202\b\b\002\020\022\032\0020\020H\002J\017\020\023\032\b\022\004\022\0020\0040\024HÆ\001¨\006\025"}, d2 = {"Lai/grazie/license/DataloreLicense$Companion;", "", "()V", "invoke", "Lai/grazie/license/DataloreLicense;", "licenseId", "", "type", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "licenseName", "seats", "", "cancelled", "", "suspended", "outdated", "serializer", "Lkotlinx/serialization/KSerializer;", "model-license"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<DataloreLicense> serializer() {
/* 20 */     return (KSerializer<DataloreLicense>)DataloreLicense.$serializer.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final DataloreLicense invoke(@NotNull String licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @NotNull Timestamp till, @NotNull String licenseName, int seats, boolean cancelled, boolean suspended, boolean outdated) {
/* 31 */     Intrinsics.checkNotNullParameter(licenseId, "licenseId"); Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(since, "since"); Intrinsics.checkNotNullParameter(till, "till"); Intrinsics.checkNotNullParameter(licenseName, "licenseName"); return new DataloreLicense(
/* 32 */         new LicenseID("dl:" + licenseId), type, since, till, licenseName, seats, cancelled, suspended, outdated);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\DataloreLicense$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */