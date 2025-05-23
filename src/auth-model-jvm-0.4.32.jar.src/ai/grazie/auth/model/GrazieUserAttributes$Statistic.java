/*    */ package ai.grazie.auth.model;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Statistic;", "", "()V", "LastSeen", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "getLastSeen", "()Lai/grazie/utils/attributes/Attributes$Key$Long;", "RegistrationDate", "getRegistrationDate", "auth-model"})
/*    */ public final class Statistic
/*    */ {
/*    */   @NotNull
/* 32 */   public static final Statistic INSTANCE = new Statistic(); @NotNull private static final Attributes.Key.Long LastSeen = new Attributes.Key.Long("user.statistic.last-seen"); @NotNull public final Attributes.Key.Long getLastSeen() { return LastSeen; } @NotNull
/* 33 */   private static final Attributes.Key.Long RegistrationDate = new Attributes.Key.Long("user.statistic.registration-date"); @NotNull public final Attributes.Key.Long getRegistrationDate() { return RegistrationDate; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUserAttributes$Statistic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */