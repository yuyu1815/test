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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Meta;", "", "()V", "Email", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getEmail", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "FullName", "getFullName", "auth-model"})
/*    */ public final class Meta
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Meta INSTANCE = new Meta(); @NotNull private static final Attributes.Key.Text FullName = new Attributes.Key.Text("user.full-name", null, 2, null); @NotNull public final Attributes.Key.Text getFullName() { return FullName; } @NotNull
/* 28 */   private static final Attributes.Key.Text Email = new Attributes.Key.Text("user.email", null, 2, null); @NotNull public final Attributes.Key.Text getEmail() { return Email; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUserAttributes$Meta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */