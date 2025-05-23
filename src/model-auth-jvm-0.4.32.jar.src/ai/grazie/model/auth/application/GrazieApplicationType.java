/*    */ package ai.grazie.model.auth.application;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\n\b\001\030\000 \f2\b\022\004\022\0020\0000\001:\001\fB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\r"}, d2 = {"Lai/grazie/model/auth/application/GrazieApplicationType;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "YouTrack", "IdeServices", "Custom", "Datalore", "LicenseServer", "Companion", "model-auth"})
/*    */ public enum GrazieApplicationType { @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String id;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*  9 */   YouTrack("youtrack"),
/* 10 */   IdeServices("ides"),
/* 11 */   Custom("custom"),
/* 12 */   Datalore("datalore"),
/* 13 */   LicenseServer("license_server"); GrazieApplicationType(String id) { this.id = id; } @NotNull public final String getId() { return this.id; } static { Companion = new Companion(null);
/*    */     
/* 15 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.auth.application.GrazieApplicationType", (Enum[])GrazieApplicationType.values()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/auth/application/GrazieApplicationType$Companion;", "", "()V", "of", "Lai/grazie/model/auth/application/GrazieApplicationType;", "id", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-auth"}) @SourceDebugExtension({"SMAP\nGrazieApplicationType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieApplicationType.kt\nai/grazie/model/auth/application/GrazieApplicationType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<GrazieApplicationType> serializer() { return get$cachedSerializer(); }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final GrazieApplicationType of(@NotNull String id) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'id'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic values : ()[Lai/grazie/model/auth/application/GrazieApplicationType;
/*    */       //   9: astore_2
/*    */       //   10: iconst_0
/*    */       //   11: istore_3
/*    */       //   12: aload_2
/*    */       //   13: arraylength
/*    */       //   14: istore #4
/*    */       //   16: iload_3
/*    */       //   17: iload #4
/*    */       //   19: if_icmpge -> 69
/*    */       //   22: aload_2
/*    */       //   23: iload_3
/*    */       //   24: aaload
/*    */       //   25: astore #5
/*    */       //   27: aload #5
/*    */       //   29: astore #6
/*    */       //   31: iconst_0
/*    */       //   32: istore #7
/*    */       //   34: aload #6
/*    */       //   36: invokevirtual getId : ()Ljava/lang/String;
/*    */       //   39: aload_1
/*    */       //   40: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */       //   43: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */       //   46: dup
/*    */       //   47: ldc 'toLowerCase(...)'
/*    */       //   49: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   52: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   55: ifeq -> 63
/*    */       //   58: aload #5
/*    */       //   60: goto -> 70
/*    */       //   63: iinc #3, 1
/*    */       //   66: goto -> 16
/*    */       //   69: aconst_null
/*    */       //   70: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #16	-> 6
/*    */       //   #20	-> 31
/*    */       //   #16	-> 34
/*    */       //   #16	-> 52
/*    */       //   #16	-> 55
/*    */       //   #16	-> 70
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   34	21	7	$i$a$-find-GrazieApplicationType$Companion$of$1	I
/*    */       //   31	24	6	it	Lai/grazie/model/auth/application/GrazieApplicationType;
/*    */       //   0	71	0	this	Lai/grazie/model/auth/application/GrazieApplicationType$Companion;
/*    */       //   0	71	1	id	Ljava/lang/String;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\application\GrazieApplicationType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */