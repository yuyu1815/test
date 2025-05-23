/*    */ package ai.grazie.model.auth;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\024\b\001\030\000 \0302\b\022\004\022\0020\0000\001:\001\030B!\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003¢\006\002\020\007J\006\020\r\032\0020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\tR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\013j\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027¨\006\031"}, d2 = {"Lai/grazie/model/auth/GrazieUserState;", "", "shouldHaveAccess", "", "display", "", "requireLicense", "(Ljava/lang/String;IZLjava/lang/String;Z)V", "getDisplay", "()Ljava/lang/String;", "getRequireLicense", "()Z", "getShouldHaveAccess", "isDomestic", "NONE", "WAIT_LIST", "LICENSE_ISSUING", "LICENSE_DECLINED", "LICENSE_OUTDATED", "EAP", "SERVICE", "INTERNAL", "FREE", "PAID", "Companion", "model-auth"})
/*    */ public enum GrazieUserState {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   private final boolean shouldHaveAccess;
/*    */   @NotNull
/*    */   private final String display;
/*    */   private final boolean requireLicense;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/* 15 */   NONE(false, "Registered", false, 4, null),
/* 16 */   WAIT_LIST(false, "In Wait List", false, 4, null),
/*    */   
/* 18 */   LICENSE_ISSUING(false, "License Issuing", false, 4, null),
/* 19 */   LICENSE_DECLINED(false, "License Declined", false, 4, null),
/* 20 */   LICENSE_OUTDATED(false, "License Outdated", false, 4, null),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   EAP(true, "In EAP", false, 4, null),
/*    */ 
/*    */   
/* 28 */   SERVICE(true, "Service", false),
/*    */ 
/*    */   
/* 31 */   INTERNAL(true, "Internal", false),
/*    */ 
/*    */   
/* 34 */   FREE(true, "Free", false, 4, null),
/* 35 */   PAID(true, "Paid", false, 4, null); GrazieUserState(boolean shouldHaveAccess, String display, boolean requireLicense) { this.shouldHaveAccess = shouldHaveAccess; this.display = display; this.requireLicense = requireLicense; } public final boolean getShouldHaveAccess() { return this.shouldHaveAccess; } @NotNull public final String getDisplay() { return this.display; } public final boolean getRequireLicense() { return this.requireLicense; } static { Companion = new Companion(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); } public final boolean isDomestic() { GrazieUserState[] arrayOfGrazieUserState = new GrazieUserState[2]; arrayOfGrazieUserState[0] = SERVICE; arrayOfGrazieUserState[1] = INTERNAL; return CollectionsKt.listOf((Object[])arrayOfGrazieUserState).contains(this); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.auth.GrazieUserState", (Enum[])GrazieUserState.values()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/auth/GrazieUserState$Companion;", "", "()V", "parse", "Lai/grazie/model/auth/GrazieUserState;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-auth"}) @SourceDebugExtension({"SMAP\nGrazieUserState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieUserState.kt\nai/grazie/model/auth/GrazieUserState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<GrazieUserState> serializer() { return get$cachedSerializer(); }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final GrazieUserState parse(@NotNull String value) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'value'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic values : ()[Lai/grazie/model/auth/GrazieUserState;
/*    */       //   9: astore_2
/*    */       //   10: iconst_0
/*    */       //   11: istore_3
/*    */       //   12: aload_2
/*    */       //   13: arraylength
/*    */       //   14: istore #4
/*    */       //   16: iload_3
/*    */       //   17: iload #4
/*    */       //   19: if_icmpge -> 81
/*    */       //   22: aload_2
/*    */       //   23: iload_3
/*    */       //   24: aaload
/*    */       //   25: astore #5
/*    */       //   27: aload #5
/*    */       //   29: astore #6
/*    */       //   31: iconst_0
/*    */       //   32: istore #7
/*    */       //   34: aload #6
/*    */       //   36: invokevirtual name : ()Ljava/lang/String;
/*    */       //   39: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */       //   42: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */       //   45: dup
/*    */       //   46: ldc 'toLowerCase(...)'
/*    */       //   48: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   51: aload_1
/*    */       //   52: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */       //   55: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */       //   58: dup
/*    */       //   59: ldc 'toLowerCase(...)'
/*    */       //   61: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   64: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   67: ifeq -> 75
/*    */       //   70: aload #5
/*    */       //   72: goto -> 82
/*    */       //   75: iinc #3, 1
/*    */       //   78: goto -> 16
/*    */       //   81: aconst_null
/*    */       //   82: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #43	-> 6
/*    */       //   #47	-> 31
/*    */       //   #43	-> 34
/*    */       //   #43	-> 51
/*    */       //   #43	-> 64
/*    */       //   #43	-> 67
/*    */       //   #43	-> 82
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   34	33	7	$i$a$-find-GrazieUserState$Companion$parse$1	I
/*    */       //   31	36	6	it	Lai/grazie/model/auth/GrazieUserState;
/*    */       //   0	83	0	this	Lai/grazie/model/auth/GrazieUserState$Companion;
/*    */       //   0	83	1	value	Ljava/lang/String;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\GrazieUserState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */