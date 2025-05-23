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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J9\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\017H\002J\017\020\020\032\b\022\004\022\0020\0040\021HÆ\001¨\006\022"}, d2 = {"Lai/grazie/license/YTLicense$Companion;", "", "()V", "invoke", "Lai/grazie/license/YTLicense;", "name", "", "deployment", "Lai/grazie/license/YTLicense$YTDeployment;", "type", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "seats", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-license"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<YTLicense> serializer() {
/* 21 */     return (KSerializer<YTLicense>)YTLicense.$serializer.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final YTLicense invoke(@NotNull String name, @NotNull YTLicense.YTDeployment deployment, @NotNull LicenseType type, @NotNull Timestamp since, @NotNull Timestamp till, int seats) {
/* 29 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(deployment, "deployment"); Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(since, "since"); Intrinsics.checkNotNullParameter(till, "till"); return new YTLicense(
/* 30 */         new LicenseID("yt:" + deployment.getId() + ":" + name), 
/* 31 */         deployment, 
/* 32 */         type, since, till, seats);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\YTLicense$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */