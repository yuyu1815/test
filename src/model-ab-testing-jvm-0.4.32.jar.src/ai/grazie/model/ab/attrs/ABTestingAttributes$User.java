/*    */ package ai.grazie.model.ab.attrs;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/ab/attrs/ABTestingAttributes$User;", "", "()V", "optOut", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "getOptOut", "()Lai/grazie/utils/attributes/Attributes$Key$Bool;", "model-ab-testing"})
/*    */ public final class User
/*    */ {
/*    */   @NotNull
/* 14 */   public static final User INSTANCE = new User(); @NotNull private static final Attributes.Key.Bool optOut = new Attributes.Key.Bool("ab-testing.user.opt-out"); @NotNull public final Attributes.Key.Bool getOptOut() { return optOut; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\attrs\ABTestingAttributes$User.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */