/*    */ package ai.grazie.auth.model;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\b\007\030\000 \0252\0020\001:\001\025B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\bR\023\020\t\032\004\030\0010\006¢\006\b\n\000\032\004\b\n\020\bR\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\r\020\016R\027\020\017\032\0020\020¢\006\016\n\000\022\004\b\021\020\022\032\004\b\023\020\024¨\006\026"}, d2 = {"Lai/grazie/auth/model/GrazieUserToken;", "Lai/grazie/auth/model/GrazieToken;", "token", "Lai/grazie/utils/jwt/JWTToken;", "(Lai/grazie/utils/jwt/JWTToken;)V", "expiration", "Lai/grazie/utils/mpp/time/Timestamp;", "getExpiration", "()Lai/grazie/utils/mpp/time/Timestamp;", "registration", "getRegistration", "state", "Lai/grazie/model/auth/GrazieUserState;", "getState", "()Lai/grazie/model/auth/GrazieUserState;", "uid", "Lai/grazie/utils/mpp/UUID;", "getUid$annotations", "()V", "getUid", "()Lai/grazie/utils/mpp/UUID;", "Companion", "auth-model"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieUserToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieUserToken.kt\nai/grazie/auth/model/GrazieUserToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
/*    */ public final class GrazieUserToken extends GrazieToken { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final UUID uid;
/*    */   @NotNull
/*    */   private final Timestamp expiration;
/*    */   
/*    */   @NotNull
/* 11 */   public final UUID getUid() { return this.uid; }
/*    */   @Nullable private final Timestamp registration; @Nullable private final GrazieUserState state; public GrazieUserToken(@NotNull JWTToken token) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'token'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: aload_1
/*    */     //   8: invokespecial <init> : (Lai/grazie/utils/jwt/JWTToken;)V
/*    */     //   11: aload_0
/*    */     //   12: aload_1
/*    */     //   13: ldc 'uid'
/*    */     //   15: invokevirtual getUUID : (Ljava/lang/String;)Lai/grazie/utils/mpp/UUID;
/*    */     //   18: dup
/*    */     //   19: ifnonnull -> 36
/*    */     //   22: pop
/*    */     //   23: new java/lang/IllegalStateException
/*    */     //   26: dup
/*    */     //   27: ldc 'Incorrect token provided'
/*    */     //   29: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   32: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   35: athrow
/*    */     //   36: putfield uid : Lai/grazie/utils/mpp/UUID;
/*    */     //   39: aload_0
/*    */     //   40: aload_1
/*    */     //   41: invokevirtual getExpiration : ()Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   44: putfield expiration : Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   47: aload_0
/*    */     //   48: aload_1
/*    */     //   49: ldc 'registration_date'
/*    */     //   51: invokevirtual getTimestamp : (Ljava/lang/String;)Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   54: putfield registration : Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   57: aload_0
/*    */     //   58: aload_1
/*    */     //   59: ldc 'user_state'
/*    */     //   61: invokevirtual getText : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   64: dup
/*    */     //   65: ifnull -> 162
/*    */     //   68: astore_2
/*    */     //   69: astore #10
/*    */     //   71: iconst_0
/*    */     //   72: istore_3
/*    */     //   73: invokestatic values : ()[Lai/grazie/model/auth/GrazieUserState;
/*    */     //   76: astore #4
/*    */     //   78: iconst_0
/*    */     //   79: istore #5
/*    */     //   81: aload #4
/*    */     //   83: arraylength
/*    */     //   84: istore #6
/*    */     //   86: iload #5
/*    */     //   88: iload #6
/*    */     //   90: if_icmpge -> 154
/*    */     //   93: aload #4
/*    */     //   95: iload #5
/*    */     //   97: aaload
/*    */     //   98: astore #7
/*    */     //   100: aload #7
/*    */     //   102: astore #8
/*    */     //   104: iconst_0
/*    */     //   105: istore #9
/*    */     //   107: aload #8
/*    */     //   109: invokevirtual name : ()Ljava/lang/String;
/*    */     //   112: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   115: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   118: dup
/*    */     //   119: ldc 'toLowerCase(...)'
/*    */     //   121: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   124: aload_2
/*    */     //   125: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   128: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   131: dup
/*    */     //   132: ldc 'toLowerCase(...)'
/*    */     //   134: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   137: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   140: ifeq -> 148
/*    */     //   143: aload #7
/*    */     //   145: goto -> 155
/*    */     //   148: iinc #5, 1
/*    */     //   151: goto -> 86
/*    */     //   154: aconst_null
/*    */     //   155: nop
/*    */     //   156: aload #10
/*    */     //   158: swap
/*    */     //   159: goto -> 164
/*    */     //   162: pop
/*    */     //   163: aconst_null
/*    */     //   164: putfield state : Lai/grazie/model/auth/GrazieUserState;
/*    */     //   167: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 6
/*    */     //   #11	-> 11
/*    */     //   #12	-> 39
/*    */     //   #13	-> 47
/*    */     //   #14	-> 57
/*    */     //   #21	-> 69
/*    */     //   #14	-> 73
/*    */     //   #21	-> 104
/*    */     //   #14	-> 107
/*    */     //   #14	-> 124
/*    */     //   #14	-> 137
/*    */     //   #14	-> 140
/*    */     //   #14	-> 155
/*    */     //   #14	-> 159
/*    */     //   #14	-> 162
/*    */     //   #9	-> 167
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   107	33	9	$i$a$-find-GrazieUserToken$state$1$1	I
/*    */     //   104	36	8	it	Lai/grazie/model/auth/GrazieUserState;
/*    */     //   73	83	3	$i$a$-let-GrazieUserToken$state$1	I
/*    */     //   71	85	2	value	Ljava/lang/String;
/*    */     //   0	168	0	this	Lai/grazie/auth/model/GrazieUserToken;
/* 12 */     //   0	168	1	token	Lai/grazie/utils/jwt/JWTToken; } @NotNull public final Timestamp getExpiration() { return this.expiration; } @Nullable
/* 13 */   public final Timestamp getRegistration() { return this.registration; } @Nullable
/* 14 */   public final GrazieUserState getState() { return this.state; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/GrazieUserToken$Companion;", "", "()V", "decode", "Lai/grazie/auth/model/GrazieUserToken;", "token", "", "auth-model"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*    */     public final GrazieUserToken decode(@NotNull String token) {
/* 17 */       Intrinsics.checkNotNullParameter(token, "token"); return new GrazieUserToken(new JWTToken(token));
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUserToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */