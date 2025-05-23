/*    */ package ai.grazie.utils.mpp.geo;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\b\b\030\000 \0232\0020\001:\001\023B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\013\032\0020\003HÆ\003J\023\020\f\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\006HÖ\001R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2 = {"Lai/grazie/utils/mpp/geo/Country;", "", "iso", "Lai/grazie/utils/mpp/geo/CountryISO;", "(Lai/grazie/utils/mpp/geo/CountryISO;)V", "display", "", "getDisplay", "()Ljava/lang/String;", "getIso", "()Lai/grazie/utils/mpp/geo/CountryISO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "utils-common"})
/*    */ public final class Country {
/*  6 */   public Country(@NotNull CountryISO iso) { this.iso = iso;
/*  7 */     this.display = this.iso.getDisplay(); } @NotNull public final String getDisplay() { return this.display; }
/*    */    @NotNull
/*    */   public final CountryISO getIso() {
/*    */     return this.iso;
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\030\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\033\032\004\030\0010\0042\006\020\034\032\0020\035R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\004¢\006\b\n\000\032\004\b\020\020\006R\021\020\021\032\0020\004¢\006\b\n\000\032\004\b\022\020\006R\021\020\023\032\0020\004¢\006\b\n\000\032\004\b\024\020\006R\021\020\025\032\0020\004¢\006\b\n\000\032\004\b\026\020\006R\021\020\027\032\0020\004¢\006\b\n\000\032\004\b\030\020\006R\021\020\031\032\0020\004¢\006\b\n\000\032\004\b\032\020\006¨\006\036"}, d2 = {"Lai/grazie/utils/mpp/geo/Country$Companion;", "", "()V", "Australia", "Lai/grazie/utils/mpp/geo/Country;", "getAustralia", "()Lai/grazie/utils/mpp/geo/Country;", "Brazil", "getBrazil", "Brunei", "getBrunei", "Canada", "getCanada", "China", "getChina", "Congo", "getCongo", "Germany", "getGermany", "India", "getIndia", "Russia", "getRussia", "USA", "getUSA", "Vietnam", "getVietnam", "findByAlpha2", "alpha2", "", "utils-common"})
/*    */   @SourceDebugExtension({"SMAP\nCountry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Country.kt\nai/grazie/utils/mpp/geo/Country$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @Nullable
/*    */     public final Country findByAlpha2(@NotNull String alpha2) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'alpha2'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: invokestatic values : ()[Lai/grazie/utils/mpp/geo/CountryISO;
/*    */       //   9: astore_3
/*    */       //   10: iconst_0
/*    */       //   11: istore #4
/*    */       //   13: aload_3
/*    */       //   14: arraylength
/*    */       //   15: istore #5
/*    */       //   17: iload #4
/*    */       //   19: iload #5
/*    */       //   21: if_icmpge -> 61
/*    */       //   24: aload_3
/*    */       //   25: iload #4
/*    */       //   27: aaload
/*    */       //   28: astore #6
/*    */       //   30: aload #6
/*    */       //   32: astore #7
/*    */       //   34: iconst_0
/*    */       //   35: istore #8
/*    */       //   37: aload #7
/*    */       //   39: invokevirtual getAlpha2 : ()Ljava/lang/String;
/*    */       //   42: aload_1
/*    */       //   43: iconst_1
/*    */       //   44: invokestatic equals : (Ljava/lang/String;Ljava/lang/String;Z)Z
/*    */       //   47: ifeq -> 55
/*    */       //   50: aload #6
/*    */       //   52: goto -> 62
/*    */       //   55: iinc #4, 1
/*    */       //   58: goto -> 17
/*    */       //   61: aconst_null
/*    */       //   62: dup
/*    */       //   63: ifnonnull -> 69
/*    */       //   66: pop
/*    */       //   67: aconst_null
/*    */       //   68: areturn
/*    */       //   69: astore_2
/*    */       //   70: new ai/grazie/utils/mpp/geo/Country
/*    */       //   73: dup
/*    */       //   74: aload_2
/*    */       //   75: invokespecial <init> : (Lai/grazie/utils/mpp/geo/CountryISO;)V
/*    */       //   78: areturn
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #14	-> 6
/*    */       //   #32	-> 34
/*    */       //   #14	-> 37
/*    */       //   #14	-> 47
/*    */       //   #14	-> 62
/*    */       //   #15	-> 70
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   37	10	8	$i$a$-find-Country$Companion$findByAlpha2$iso$1	I
/*    */       //   34	13	7	it	Lai/grazie/utils/mpp/geo/CountryISO;
/*    */       //   70	9	2	iso	Lai/grazie/utils/mpp/geo/CountryISO;
/*    */       //   0	79	0	this	Lai/grazie/utils/mpp/geo/Country$Companion;
/*    */       //   0	79	1	alpha2	Ljava/lang/String;
/*    */     } @NotNull
/*    */     public final Country getRussia() {
/* 18 */       return Country.Russia; } @NotNull
/* 19 */     public final Country getChina() { return Country.China; } @NotNull
/* 20 */     public final Country getUSA() { return Country.USA; } @NotNull
/* 21 */     public final Country getGermany() { return Country.Germany; } @NotNull
/* 22 */     public final Country getBrunei() { return Country.Brunei; } @NotNull
/* 23 */     public final Country getVietnam() { return Country.Vietnam; } @NotNull
/* 24 */     public final Country getAustralia() { return Country.Australia; } @NotNull
/* 25 */     public final Country getCanada() { return Country.Canada; } @NotNull
/* 26 */     public final Country getBrazil() { return Country.Brazil; } @NotNull
/* 27 */     public final Country getIndia() { return Country.India; } @NotNull
/* 28 */     public final Country getCongo() { return Country.Congo; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final Country Congo = new Country(CountryISO.CONGO);
/*    */   @NotNull
/*    */   private final CountryISO iso;
/*    */   @NotNull
/*    */   private final String display;
/*    */   @NotNull
/*    */   private static final Country Russia = new Country(CountryISO.RUSSIAN_FEDERATION);
/*    */   @NotNull
/*    */   private static final Country China = new Country(CountryISO.CHINA);
/*    */   @NotNull
/*    */   private static final Country USA = new Country(CountryISO.UNITED_STATES_OF_AMERICA);
/*    */   @NotNull
/*    */   private static final Country Germany = new Country(CountryISO.GERMANY);
/*    */   @NotNull
/*    */   private static final Country Brunei = new Country(CountryISO.BRUNEI_DARUSSALAM);
/*    */   @NotNull
/*    */   private static final Country Vietnam = new Country(CountryISO.VIET_NAM);
/*    */   @NotNull
/*    */   private static final Country Australia = new Country(CountryISO.AUSTRALIA);
/*    */   @NotNull
/*    */   private static final Country Canada = new Country(CountryISO.CANADA);
/*    */   @NotNull
/*    */   private static final Country Brazil = new Country(CountryISO.BRAZIL);
/*    */   @NotNull
/*    */   private static final Country India = new Country(CountryISO.INDIA);
/*    */   
/*    */   @NotNull
/*    */   public final CountryISO component1() {
/*    */     return this.iso;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Country copy(@NotNull CountryISO iso) {
/*    */     Intrinsics.checkNotNullParameter(iso, "iso");
/*    */     return new Country(iso);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Country(iso=" + this.iso + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.iso.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Country))
/*    */       return false; 
/*    */     Country country = (Country)other;
/*    */     return !(this.iso != country.iso);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\geo\Country.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */