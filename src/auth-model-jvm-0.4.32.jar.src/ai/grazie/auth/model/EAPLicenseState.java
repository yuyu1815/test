/*    */ package ai.grazie.auth.model;
/*    */ import ai.grazie.model.auth.GrazieUserState;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\b\001\030\000 \0202\b\022\004\022\0020\0000\001:\001\020B\027\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017¨\006\021"}, d2 = {"Lai/grazie/auth/model/EAPLicenseState;", "", "display", "", "userState", "Lai/grazie/model/auth/GrazieUserState;", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/auth/GrazieUserState;)V", "getDisplay", "()Ljava/lang/String;", "getUserState", "()Lai/grazie/model/auth/GrazieUserState;", "NONE", "WAIT_LIST", "ISSUING", "DECLINED", "ISSUED", "Companion", "auth-model"})
/*    */ public enum EAPLicenseState {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String display;
/*    */   @NotNull
/*    */   private final GrazieUserState userState;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/* 18 */   NONE("Unused", GrazieUserState.NONE),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 23 */   WAIT_LIST("In Wait List", GrazieUserState.WAIT_LIST),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   ISSUING("License Issuing", GrazieUserState.LICENSE_ISSUING),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 33 */   DECLINED("License Declined", GrazieUserState.LICENSE_DECLINED),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 38 */   ISSUED("License Issued", GrazieUserState.EAP); EAPLicenseState(String display, GrazieUserState userState) { this.display = display; this.userState = userState; } @NotNull public final String getDisplay() { return this.display; } @NotNull public final GrazieUserState getUserState() { return this.userState; } static { Companion = new Companion(null);
/*    */     
/* 40 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.auth.model.EAPLicenseState", (Enum[])EAPLicenseState.values()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/auth/model/EAPLicenseState$Companion;", "", "()V", "fromUserState", "Lai/grazie/auth/model/EAPLicenseState;", "state", "Lai/grazie/model/auth/GrazieUserState;", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-model"}) @SourceDebugExtension({"SMAP\nEAPLicenseState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EAPLicenseState.kt\nai/grazie/auth/model/EAPLicenseState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,44:1\n1310#2,2:45\n*S KotlinDebug\n*F\n+ 1 EAPLicenseState.kt\nai/grazie/auth/model/EAPLicenseState$Companion\n*L\n41#1:45,2\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<EAPLicenseState> serializer() { return get$cachedSerializer(); }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final EAPLicenseState fromUserState(@NotNull GrazieUserState state) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'state'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic values : ()[Lai/grazie/auth/model/EAPLicenseState;
/*    */       //   9: astore_2
/*    */       //   10: iconst_0
/*    */       //   11: istore_3
/*    */       //   12: iconst_0
/*    */       //   13: istore #4
/*    */       //   15: aload_2
/*    */       //   16: arraylength
/*    */       //   17: istore #5
/*    */       //   19: iload #4
/*    */       //   21: iload #5
/*    */       //   23: if_icmpge -> 67
/*    */       //   26: aload_2
/*    */       //   27: iload #4
/*    */       //   29: aaload
/*    */       //   30: astore #6
/*    */       //   32: aload #6
/*    */       //   34: astore #7
/*    */       //   36: iconst_0
/*    */       //   37: istore #8
/*    */       //   39: aload #7
/*    */       //   41: invokevirtual getUserState : ()Lai/grazie/model/auth/GrazieUserState;
/*    */       //   44: aload_1
/*    */       //   45: if_acmpne -> 52
/*    */       //   48: iconst_1
/*    */       //   49: goto -> 53
/*    */       //   52: iconst_0
/*    */       //   53: ifeq -> 61
/*    */       //   56: aload #6
/*    */       //   58: goto -> 68
/*    */       //   61: iinc #4, 1
/*    */       //   64: goto -> 19
/*    */       //   67: aconst_null
/*    */       //   68: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #41	-> 6
/*    */       //   #45	-> 12
/*    */       //   #41	-> 39
/*    */       //   #45	-> 53
/*    */       //   #46	-> 67
/*    */       //   #41	-> 68
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   39	14	8	$i$a$-firstOrNull-EAPLicenseState$Companion$fromUserState$1	I
/*    */       //   36	17	7	it	Lai/grazie/auth/model/EAPLicenseState;
/*    */       //   32	29	6	element$iv	Ljava/lang/Object;
/*    */       //   12	56	3	$i$f$firstOrNull	I
/*    */       //   10	58	2	$this$firstOrNull$iv	[Ljava/lang/Object;
/*    */       //   0	69	0	this	Lai/grazie/auth/model/EAPLicenseState$Companion;
/*    */       //   0	69	1	state	Lai/grazie/model/auth/GrazieUserState;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\EAPLicenseState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */