/*     */ package ai.grazie.nlp.langs;
/*     */ 
/*     */ import java.util.Locale;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.LazyThreadSafetyMode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.internal.EnumsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\016\n\002\b\"\b\001\030\000 %2\b\022\004\022\0020\0000\001:\001%B\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H\026j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036j\002\b\037j\002\b j\002\b!j\002\b\"j\002\b#j\002\b$¨\006&"}, d2 = {"Lai/grazie/nlp/langs/LanguageISO;", "", "(Ljava/lang/String;I)V", "toString", "", "AST", "DE", "EL", "KM", "EN", "SL", "SV", "TL", "BR", "EO", "CA", "GL", "GA", "DA", "ES", "TA", "AR", "FA", "FR", "IT", "JA", "KO", "NL", "PL", "PT", "RO", "RU", "SK", "UK", "BE", "ZH", "UNKNOWN", "Companion", "nlp-langs"})
/*     */ public enum LanguageISO
/*     */ {
/*  34 */   AST,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   DE,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   EL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   KM,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   EN,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   SL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  64 */   SV,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   TL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   BR,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   EO,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  84 */   CA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   GL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   GA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  99 */   DA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   ES,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 109 */   TA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   AR,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   FA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 124 */   FR,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 129 */   IT,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 134 */   JA,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 139 */   KO,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 144 */   NL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 149 */   PL,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 154 */   PT,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 159 */   RO,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 164 */   RU,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 169 */   SK,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 174 */   UK,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 179 */   BE,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 184 */   ZH,
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 189 */   UNKNOWN; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; @NotNull public String toString() { Intrinsics.checkNotNullExpressionValue(name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return name().toLowerCase(Locale.ROOT); } static { Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */     
/* 193 */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.nlp.langs.LanguageISO", (Enum[])LanguageISO.values()); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/nlp/langs/LanguageISO$Companion;", "", "()V", "parse", "Lai/grazie/nlp/langs/LanguageISO;", "code", "", "serializer", "Lkotlinx/serialization/KSerializer;", "nlp-langs"}) @SourceDebugExtension({"SMAP\nLanguageISO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanguageISO.kt\nai/grazie/nlp/langs/LanguageISO$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LanguageISO> serializer() { return get$cachedSerializer(); }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final LanguageISO parse(@NotNull String code) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'code'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic values : ()[Lai/grazie/nlp/langs/LanguageISO;
/*     */       //   9: astore_2
/*     */       //   10: iconst_0
/*     */       //   11: istore_3
/*     */       //   12: aload_2
/*     */       //   13: arraylength
/*     */       //   14: istore #4
/*     */       //   16: iload_3
/*     */       //   17: iload #4
/*     */       //   19: if_icmpge -> 81
/*     */       //   22: aload_2
/*     */       //   23: iload_3
/*     */       //   24: aaload
/*     */       //   25: astore #5
/*     */       //   27: aload #5
/*     */       //   29: astore #6
/*     */       //   31: iconst_0
/*     */       //   32: istore #7
/*     */       //   34: aload #6
/*     */       //   36: invokevirtual name : ()Ljava/lang/String;
/*     */       //   39: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   42: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   45: dup
/*     */       //   46: ldc 'toLowerCase(...)'
/*     */       //   48: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   51: aload_1
/*     */       //   52: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */       //   55: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */       //   58: dup
/*     */       //   59: ldc 'toLowerCase(...)'
/*     */       //   61: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   64: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   67: ifeq -> 75
/*     */       //   70: aload #5
/*     */       //   72: goto -> 82
/*     */       //   75: iinc #3, 1
/*     */       //   78: goto -> 16
/*     */       //   81: aconst_null
/*     */       //   82: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #195	-> 6
/*     */       //   #200	-> 31
/*     */       //   #195	-> 34
/*     */       //   #195	-> 51
/*     */       //   #195	-> 64
/*     */       //   #195	-> 67
/*     */       //   #195	-> 82
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   34	33	7	$i$a$-find-LanguageISO$Companion$parse$1	I
/*     */       //   31	36	6	it	Lai/grazie/nlp/langs/LanguageISO;
/*     */       //   0	83	0	this	Lai/grazie/nlp/langs/LanguageISO$Companion;
/*     */       //   0	83	1	code	Ljava/lang/String;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\langs\LanguageISO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */