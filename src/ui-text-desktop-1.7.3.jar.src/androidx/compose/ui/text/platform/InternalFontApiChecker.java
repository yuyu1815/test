/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\013\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\f\032\0020\004H\002J\006\020\r\032\0020\004J\006\020\016\032\0020\004R%\020\005\032\0020\0042\006\020\003\032\0020\0048B@BX\002¢\006\f\032\004\b\006\020\007\"\004\b\b\020\tR%\020\n\032\0020\0042\006\020\003\032\0020\0048B@BX\002¢\006\f\032\004\b\n\020\007\"\004\b\013\020\t¨\006\017"}, d2 = {"Landroidx/compose/ui/text/platform/InternalFontApiChecker;", "", "()V", "<set-?>", "", "hasCheckedAccess", "getHasCheckedAccess", "()Z", "setHasCheckedAccess", "(Z)V", "isSunFontAccessible", "setSunFontAccessible", "canAccessSunFontApi", "isRunningOnJetBrainsRuntime", "isSunFontApiAccessible", "ui-text"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nInternalFontApiChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalFontApiChecker.kt\nandroidx/compose/ui/text/platform/InternalFontApiChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n618#2,12:67\n*S KotlinDebug\n*F\n+ 1 InternalFontApiChecker.kt\nandroidx/compose/ui/text/platform/InternalFontApiChecker\n*L\n42#1:67,12\n*E\n"})
/*    */ public final class InternalFontApiChecker
/*    */ {
/*    */   @NotNull
/*    */   public static final InternalFontApiChecker INSTANCE = new InternalFontApiChecker();
/*    */   public static final int $stable = 8;
/*    */   
/*    */   private final boolean getHasCheckedAccess() {
/* 23 */     return this.hasCheckedAccess$volatile; } private final void setHasCheckedAccess(boolean <set-?>) { this.hasCheckedAccess$volatile = <set-?>; }
/* 24 */   private final boolean isSunFontAccessible() { return this.isSunFontAccessible$volatile; } private final void setSunFontAccessible(boolean <set-?>) { this.isSunFontAccessible$volatile = <set-?>; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean isSunFontApiAccessible() {
/* 31 */     if (getHasCheckedAccess()) return isSunFontAccessible();
/*    */     
/* 33 */     boolean canAccess = canAccessSunFontApi();
/* 34 */     setSunFontAccessible(canAccess);
/* 35 */     setHasCheckedAccess(true);
/* 36 */     return canAccess;
/*    */   }
/*    */   
/*    */   private final boolean canAccessSunFontApi() {
/*    */     try {
/* 41 */       Module unnamedModule = ClassLoader.getSystemClassLoader().getUnnamedModule();
/* 42 */       Intrinsics.checkNotNullExpressionValue(ModuleLayer.boot().modules(), "modules(...)"); Iterable<Module> $this$single$iv = ModuleLayer.boot().modules(); int $i$f$single = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 67 */       Object single$iv = null;
/* 68 */       boolean found$iv = false;
/* 69 */       for (Module element$iv : $this$single$iv) {
/* 70 */         Module it = element$iv; int $i$a$-single-InternalFontApiChecker$canAccessSunFontApi$desktopModule$1 = 0; if (Intrinsics.areEqual(it.getName(), "java.desktop")) {
/* 71 */           if (found$iv) throw new IllegalArgumentException("Collection contains more than one matching element."); 
/* 72 */           single$iv = element$iv;
/* 73 */           found$iv = true;
/*    */         } 
/*    */       } 
/* 76 */       if (!found$iv) throw new NoSuchElementException("Collection contains no element matching the predicate.");
/*    */       
/* 78 */       Module desktopModule = (Module)single$iv;
/*    */       if (!unnamedModule.canRead(desktopModule))
/*    */         return false; 
/*    */       if (!desktopModule.isOpen("sun.font", unnamedModule))
/*    */         return false; 
/*    */       Class<?> fontManagerClass = Class.forName("sun.font.FontManagerFactory");
/*    */       fontManagerClass.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
/*    */       return true;
/*    */     } catch (Throwable ignored) {
/*    */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final boolean isRunningOnJetBrainsRuntime() {
/*    */     return StringsKt.equals(System.getProperty("java.vendor"), "JetBrains s.r.o.", true);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\InternalFontApiChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */