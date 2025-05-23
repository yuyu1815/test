/*    */ package ai.grazie.client.common.auth;
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\022\b\007\030\0002\0020\001:\006\022\023\024\025\026\027B\005¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006J\016\020\b\032\0020\0042\006\020\005\032\0020\006J\016\020\t\032\0020\0042\006\020\005\032\0020\006J\016\020\n\032\0020\0042\006\020\005\032\0020\006J\016\020\013\032\0020\0042\006\020\005\032\0020\006J\016\020\f\032\0020\0042\006\020\005\032\0020\006J\016\020\r\032\0020\0042\006\020\005\032\0020\006J\016\020\016\032\0020\0042\006\020\005\032\0020\006J\016\020\017\032\0020\0042\006\020\005\032\0020\006J\016\020\020\032\0020\0042\006\020\005\032\0020\006J\016\020\021\032\0020\0042\006\020\005\032\0020\006¨\006\030"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents;", "", "()V", "AppCode", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Aqua", "CLion", "DataGrip", "DataSpell", "GoLand", "PhpStorm", "PyCharm", "Rider", "RubyMine", "RustRover", "WebStorm", "DotNET", "Editor", "Extension", "IntelliJ", "Play", "Plugin", "client-common"})
/*    */ public final class GrazieAgents {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006J\016\020\b\032\0020\0042\006\020\005\032\0020\006¨\006\t"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Extension;", "", "()V", "Chrome", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Firefox", "Safari", "client-common"})
/*    */   public static final class Extension {
/*    */     @NotNull
/*    */     public static final Extension INSTANCE = new Extension();
/*    */     
/*    */     @NotNull
/* 13 */     public final GrazieAgent Chrome(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-chrome-extension", version); } @NotNull
/* 14 */     public final GrazieAgent Firefox(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-firefox-extension", version); } @NotNull
/* 15 */     public final GrazieAgent Safari(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-safari-extension", version); }
/*    */   
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Editor;", "", "()V", "Desktop", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "Web", "client-common"})
/*    */   public static final class Editor { @NotNull
/* 19 */     public final GrazieAgent Web(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-web-editor", version); } @NotNull public static final Editor INSTANCE = new Editor(); @NotNull
/* 20 */     public final GrazieAgent Desktop(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-desktop-editor", version); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Plugin;", "", "()V", "Professional", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "client-common"})
/*    */   public static final class Plugin { @NotNull
/*    */     public static final Plugin INSTANCE = new Plugin();
/*    */     @NotNull
/* 24 */     public final GrazieAgent Professional(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-professional-plugin", version); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$Play;", "", "()V", "playground", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "client-common"})
/*    */   public static final class Play { @NotNull
/*    */     public static final Play INSTANCE = new Play();
/*    */     @NotNull
/* 28 */     public final GrazieAgent playground(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("grazie-playground", version); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$IntelliJ;", "", "()V", "Idea", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "client-common"})
/*    */   public static final class IntelliJ { @NotNull
/*    */     public static final IntelliJ INSTANCE = new IntelliJ();
/*    */     @NotNull
/* 32 */     public final GrazieAgent Idea(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("idea", version); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/client/common/auth/GrazieAgents$DotNET;", "", "()V", "ReSharper", "Lai/grazie/model/auth/GrazieAgent;", "version", "", "client-common"})
/*    */   public static final class DotNET { @NotNull
/*    */     public static final DotNET INSTANCE = new DotNET(); @NotNull
/*    */     public final GrazieAgent ReSharper(@NotNull String version) {
/* 36 */       Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("resharper", version);
/*    */     } }
/*    */   @NotNull
/* 39 */   public final GrazieAgent AppCode(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("appcode", version); } @NotNull
/* 40 */   public final GrazieAgent Rider(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("rider", version); } @NotNull
/* 41 */   public final GrazieAgent DataGrip(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("datagrip", version); } @NotNull
/* 42 */   public final GrazieAgent Aqua(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("aqua", version); } @NotNull
/* 43 */   public final GrazieAgent PyCharm(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("pycharm", version); } @NotNull
/* 44 */   public final GrazieAgent WebStorm(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("webstorm", version); } @NotNull
/* 45 */   public final GrazieAgent GoLand(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("goland", version); } @NotNull
/* 46 */   public final GrazieAgent PhpStorm(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("phpstorm", version); } @NotNull
/* 47 */   public final GrazieAgent CLion(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("clion", version); } @NotNull
/* 48 */   public final GrazieAgent RubyMine(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("rubymine", version); } @NotNull
/* 49 */   public final GrazieAgent DataSpell(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("dataspell", version); } @NotNull
/* 50 */   public final GrazieAgent RustRover(@NotNull String version) { Intrinsics.checkNotNullParameter(version, "version"); return new GrazieAgent("rustrover", version); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\auth\GrazieAgents.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */