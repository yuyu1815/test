/*    */ package ai.grazie.model.auth;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\000\n\002\020\021\n\002\b\033\b\001\030\000 \0372\b\022\004\022\0020\0000\001:\001\037B\035\b\002\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005¢\006\002\020\006R\031\020\004\032\b\022\004\022\0020\0030\005¢\006\n\n\002\020\t\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036¨\006 "}, d2 = {"Lai/grazie/model/auth/GrazieProduct;", "", "display", "", "agents", "", "(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)V", "getAgents", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getDisplay", "()Ljava/lang/String;", "Browser", "Docs", "Pro", "Fleet", "IntelliJ", "DotNET", "AppCode", "Rider", "DataGrip", "Aqua", "PyCharm", "WebStorm", "GoLand", "PhpStorm", "CLion", "RubyMine", "DataSpell", "RustRover", "Playground", "Companion", "model-auth"})
/*    */ public enum GrazieProduct { Browser, Docs, Pro, Fleet, IntelliJ, DotNET, AppCode, Rider, DataGrip, Aqua, PyCharm, WebStorm, GoLand, PhpStorm, CLion, RubyMine, DataSpell, RustRover, Playground; @NotNull
/*    */   public static final Companion Companion; @NotNull
/*    */   private final String display; @NotNull
/*    */   private final String[] agents; @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*  8 */   GrazieProduct(String display, String[] agents) { this.display = display; this.agents = agents; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.auth.GrazieProduct", (Enum[])GrazieProduct.values()); } } @NotNull public final String getDisplay() { return this.display; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/auth/GrazieProduct$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/auth/GrazieProduct;", "model-auth"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<GrazieProduct> serializer() { return get$cachedSerializer(); } } @NotNull public final String[] getAgents() { return this.agents; }
/*  9 */   static { String[] arrayOfString = new String[3]; arrayOfString[0] = "grazie-chrome-extension"; arrayOfString[1] = "grazie-firefox-extension"; arrayOfString[2] = "grazie-safari-extension"; Browser = new GrazieProduct("Browser", 0, "Browser Extensions", arrayOfString);
/* 10 */     arrayOfString = new String[2]; arrayOfString[0] = "grazie-web-editor"; arrayOfString[1] = "grazie-desktop-editor"; Docs = new GrazieProduct("Docs", 1, "Grazie Docs", arrayOfString);
/* 11 */     arrayOfString = new String[1]; arrayOfString[0] = "grazie-professional-plugin"; Pro = new GrazieProduct("Pro", 2, "Grazie Pro", arrayOfString);
/* 12 */     arrayOfString = new String[1]; arrayOfString[0] = "fleet"; Fleet = new GrazieProduct("Fleet", 3, "Fleet", arrayOfString);
/* 13 */     arrayOfString = new String[2]; arrayOfString[0] = "intellij"; arrayOfString[1] = "idea"; IntelliJ = new GrazieProduct("IntelliJ", 4, "IntelliJ IDEA", arrayOfString);
/* 14 */     arrayOfString = new String[1]; arrayOfString[0] = "resharper"; DotNET = new GrazieProduct("DotNET", 5, "ReSharper", arrayOfString);
/* 15 */     arrayOfString = new String[1]; arrayOfString[0] = "appcode"; AppCode = new GrazieProduct("AppCode", 6, "AppCode", arrayOfString);
/* 16 */     arrayOfString = new String[1]; arrayOfString[0] = "rider"; Rider = new GrazieProduct("Rider", 7, "Rider", arrayOfString);
/* 17 */     arrayOfString = new String[1]; arrayOfString[0] = "datagrip"; DataGrip = new GrazieProduct("DataGrip", 8, "DataGrip", arrayOfString);
/* 18 */     arrayOfString = new String[1]; arrayOfString[0] = "aqua"; Aqua = new GrazieProduct("Aqua", 9, "Aqua", arrayOfString);
/* 19 */     arrayOfString = new String[1]; arrayOfString[0] = "pycharm"; PyCharm = new GrazieProduct("PyCharm", 10, "PyCharm", arrayOfString);
/* 20 */     arrayOfString = new String[1]; arrayOfString[0] = "webstorm"; WebStorm = new GrazieProduct("WebStorm", 11, "WebStorm", arrayOfString);
/* 21 */     arrayOfString = new String[1]; arrayOfString[0] = "goland"; GoLand = new GrazieProduct("GoLand", 12, "GoLand", arrayOfString);
/* 22 */     arrayOfString = new String[1]; arrayOfString[0] = "phpstorm"; PhpStorm = new GrazieProduct("PhpStorm", 13, "PhpStorm", arrayOfString);
/* 23 */     arrayOfString = new String[1]; arrayOfString[0] = "clion"; CLion = new GrazieProduct("CLion", 14, "CLion", arrayOfString);
/* 24 */     arrayOfString = new String[1]; arrayOfString[0] = "rubymine"; RubyMine = new GrazieProduct("RubyMine", 15, "RubyMine", arrayOfString);
/* 25 */     arrayOfString = new String[1]; arrayOfString[0] = "dataspell"; DataSpell = new GrazieProduct("DataSpell", 16, "DataSpell", arrayOfString);
/* 26 */     arrayOfString = new String[1]; arrayOfString[0] = "rustrover"; RustRover = new GrazieProduct("RustRover", 17, "RustRover", arrayOfString);
/* 27 */     arrayOfString = new String[1]; arrayOfString[0] = "grazie-playground"; Playground = new GrazieProduct("Playground", 18, "Grazie Playground", arrayOfString); } static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\GrazieProduct.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */