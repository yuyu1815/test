/*    */ package org.jetbrains.compose.resources;
/*    */ import androidx.compose.ui.text.font.Font;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032.\020\f\032\0020\0012\006\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\022H\007ø\001\000¢\006\004\b\023\020\024\"!\020\000\032\0020\0018BX\002¢\006\022\n\004\b\006\020\007\022\004\b\002\020\003\032\004\b\004\020\005\"\016\020\b\032\0020\tXD¢\006\002\n\000\"\032\020\n\032\016\022\004\022\0020\t\022\004\022\0020\0010\013X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\025²\006\n\020\026\032\0020\001X\002"}, d2 = {"defaultEmptyFont", "Landroidx/compose/ui/text/font/Font;", "getDefaultEmptyFont$annotations", "()V", "getDefaultEmptyFont", "()Landroidx/compose/ui/text/font/Font;", "defaultEmptyFont$delegate", "Lkotlin/Lazy;", "emptyFontBase64", "", "fontCache", "Lorg/jetbrains/compose/resources/AsyncCache;", "Font", "resource", "Lorg/jetbrains/compose/resources/FontResource;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-DnXFreY", "(Lorg/jetbrains/compose/resources/FontResource;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/font/Font;", "library", "fontFile"})
/*    */ @SourceDebugExtension({"SMAP\nFontResources.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.skiko.kt\norg/jetbrains/compose/resources/FontResources_skikoKt\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,46:1\n81#2:47\n*S KotlinDebug\n*F\n+ 1 FontResources.skiko.kt\norg/jetbrains/compose/resources/FontResources_skikoKt\n*L\n37#1:47\n*E\n"})
/*    */ public final class FontResources_skikoKt {
/*    */   @NotNull
/* 11 */   private static final String emptyFontBase64 = "T1RUTwAJAIAAAwAQQ0ZGIML7MfIAAAQIAAAA2U9TLzJmMV8PAAABAAAAAGBjbWFwANUAVwAAA6QAAABEaGVhZCMuU7IAAACcAAAANmhoZWECvgAmAAAA1AAAACRobXR4Az4AAAAABOQAAAAQbWF4cAAEUAAAAAD4AAAABm5hbWUpw3nbAAABYAAAAkNwb3N0AAMAAAAAA+gAAAAgAAEAAAABAADs7nftXw889QADA+gAAAAA4WWJaQAAAADhZYlpAAAAAAFNAAAAAAADAAIAAAAAAAAAAQAAArz+1AAAAU0AAAAAAAAAAQAAAAAAAAAAAAAAAAAAAAQAAFAAAAQAAAADAHwB9AAFAAACigK7AAAAjAKKArsAAAHfADEBAgAAAAAAAAAAAAAAAAAAAAEAAAAAAAAAAAAAAABYWFhYAEAAIABfArz+1AAAAAAAAAAAAAEAAAAAAV4AAAAgACAAAAAAACIBngABAAAAAAAAAAIAbwABAAAAAAABAAUAAAABAAAAAAACAAcADwABAAAAAAADABAAdQABAAAAAAAEAA0AJAABAAAAAAAFAAIAbwABAAAAAAAGAAwASwABAAAAAAAHAAIAbwABAAAAAAAIAAIAbwABAAAAAAAJAAIAbwABAAAAAAAKAAIAbwABAAAAAAALAAIAbwABAAAAAAAMAAIAbwABAAAAAAANAAIAbwABAAAAAAAOAAIAbwABAAAAAAAQAAUAAAABAAAAAAARAAcADwADAAEECQAAAAQAcQADAAEECQABAAoABQADAAEECQACAA4AFgADAAEECQADACAAhQADAAEECQAEABoAMQADAAEECQAFAAQAcQADAAEECQAGABgAVwADAAEECQAHAAQAcQADAAEECQAIAAQAcQADAAEECQAJAAQAcQADAAEECQAKAAQAcQADAAEECQALAAQAcQADAAEECQAMAAQAcQADAAEECQANAAQAcQADAAEECQAOAAQAcQADAAEECQAQAAoABQADAAEECQARAA4AFmVtcHR5AGUAbQBwAHQAeVJlZ3VsYXIAUgBlAGcAdQBsAGEAcmVtcHR5IFJlZ3VsYXIAZQBtAHAAdAB5ACAAUgBlAGcAdQBsAGEAcmVtcHR5UmVndWxhcgBlAG0AcAB0AHkAUgBlAGcAdQBsAGEAciIiACIAIiIiOmVtcHR5IFJlZ3VsYXIAIgAiADoAZQBtAHAAdAB5ACAAUgBlAGcAdQBsAGEAcgAAAAABAAMAAQAAAAwABAA4AAAACgAIAAIAAgAAACAAQQBf//8AAAAAACAAQQBf//8AAP/h/8H/pAABAAAAAAAAAAAAAAADAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQAEAQABAQENZW1wdHlSZWd1bGFyAAEBASf4GwD4HAL4HQP4HgSLi/lQ9+EFHQAAAHgPHQAAAH8Rix0AAADZEgAHAQEDEBUcISIsIiJlbXB0eSBSZWd1bGFyZW1wdHlSZWd1bGFyc3BhY2VBdW5kZXJzY29yZQAAAAGLAYwBjQAEAQFMT1FT+F2f+TcVi4uL/TeLiwiLi/g1i4uLCIuLi/k3i4sIi4v8NYuLiwi7/QcVi4uL+NeLiwiLi/fUi4uLCIuLi/zXi4sIi4v71IuLiwgO9+EOnw6fDgAAAAHJAAABTQAAABQAAAAUAAA=";
/*    */   
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final Font Font-DnXFreY(@NotNull FontResource resource, @Nullable FontWeight weight, int style, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 16 */     Intrinsics.checkNotNullParameter(resource, "resource"); $composer.startReplaceGroup(1614847882); if ((paramInt1 & 0x2) != 0) weight = FontWeight.Companion.getNormal();  if ((paramInt1 & 0x4) != 0)
/* 17 */       style = FontStyle.Companion.getNormal-_-LCdwA();  if (ComposerKt.isTraceInProgress())
/*    */     {
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
/* 35 */       ComposerKt.traceEventStart(1614847882, $changed, -1, "org.jetbrains.compose.resources.Font (FontResources.skiko.kt:34)"); } 
/* 36 */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/* 37 */     State<?> fontFile$delegate = ResourceState_blockingKt.rememberResourceState(resource, weight, FontStyle.box-impl(style), FontResources_skikoKt$Font$fontFile$2.INSTANCE, new FontResources_skikoKt$Font$fontFile$3(resource, weight, style, resourceReader, null), $composer, 0x8C00 | 0xE & $changed | 0x70 & $changed | 0x380 & $changed);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     Font font = Font_DnXFreY$lambda$0((State)fontFile$delegate); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return font;
/*    */   } @NotNull private static final Lazy defaultEmptyFont$delegate = LazyKt.lazy(FontResources_skikoKt$defaultEmptyFont$2.INSTANCE); private static final Font getDefaultEmptyFont() { Lazy lazy = defaultEmptyFont$delegate; return (Font)lazy.getValue(); } private static final Font Font_DnXFreY$lambda$0(State $fontFile$delegate) { State state = $fontFile$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 47 */     return (Font)state.getValue(); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/Font;", "invoke"})
/*    */   static final class FontResources_skikoKt$defaultEmptyFont$2 extends Lambda implements Function0<Font> {
/*    */     public static final FontResources_skikoKt$defaultEmptyFont$2 INSTANCE = new FontResources_skikoKt$defaultEmptyFont$2();
/*    */     
/*    */     FontResources_skikoKt$defaultEmptyFont$2() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Font invoke() {
/*    */       return PlatformFont_skikoKt.Font-wCLgNak$default("org.jetbrains.compose.emptyFont", Base64.decode$default((Base64)Base64.Default, FontResources_skikoKt.emptyFontBase64, 0, 0, 6, null), null, 0, 12, null);
/*    */     }
/*    */   }
/*    */   @NotNull
/*    */   private static final AsyncCache<String, Font> fontCache = new AsyncCache<>();
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/Font;", "invoke"})
/*    */   static final class FontResources_skikoKt$Font$fontFile$2 extends Lambda implements Function0<Font> {
/*    */     public static final FontResources_skikoKt$Font$fontFile$2 INSTANCE = new FontResources_skikoKt$Font$fontFile$2();
/*    */     
/*    */     FontResources_skikoKt$Font$fontFile$2() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Font invoke() {
/*    */       return FontResources_skikoKt.getDefaultEmptyFont();
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FontResources.skiko.kt", l = {40}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.FontResources_skikoKt$Font$fontFile$3")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/Font;", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*    */   static final class FontResources_skikoKt$Font$fontFile$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super Font>, Object> {
/*    */     int label;
/*    */     
/*    */     FontResources_skikoKt$Font$fontFile$3(FontResource $resource, FontWeight $weight, int $style, ResourceReader $resourceReader, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       ResourceEnvironment env;
/*    */       String path, key;
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           env = (ResourceEnvironment)this.L$0;
/*    */           path = ResourceEnvironmentKt.getResourceItemByEnvironment(this.$resource, env).getPath$library();
/*    */           key = path + ":" + path + ":" + this.$weight;
/*    */           this.label = 1;
/*    */           if (FontResources_skikoKt.fontCache.getOrLoad(key, new Function1<Continuation<? super Font>, Object>(this.$resourceReader, path, this.$weight, this.$style, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   byte[] fontBytes;
/*    */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 1;
/*    */                       if (this.$resourceReader.read(this.$path, (Continuation<? super byte[]>)this) == object)
/*    */                         return object; 
/*    */                       fontBytes = (byte[])this.$resourceReader.read(this.$path, (Continuation<? super byte[]>)this);
/*    */                       return PlatformFont_skikoKt.Font-wCLgNak(this.$path, fontBytes, this.$weight, this.$style);
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       fontBytes = (byte[])SYNTHETIC_LOCAL_VARIABLE_1;
/*    */                       return PlatformFont_skikoKt.Font-wCLgNak(this.$path, fontBytes, this.$weight, this.$style);
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function1<>(this.$resourceReader, this.$path, this.$weight, this.$style, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@Nullable Continuation<?> p1) {
/*    */                   return ((null)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation<? super Font>)this) == object)
/*    */             return object; 
/*    */           return FontResources_skikoKt.fontCache.getOrLoad(key, new Function1<Continuation<? super Font>, Object>(this.$resourceReader, path, this.$weight, this.$style, null) {
/*    */                 int label;
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invokeSuspend(@NotNull Object $result) {
/*    */                   byte[] fontBytes;
/*    */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */                   switch (this.label) {
/*    */                     case 0:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       this.label = 1;
/*    */                       if (this.$resourceReader.read(this.$path, (Continuation<? super byte[]>)this) == object)
/*    */                         return object; 
/*    */                       fontBytes = (byte[])this.$resourceReader.read(this.$path, (Continuation<? super byte[]>)this);
/*    */                       return PlatformFont_skikoKt.Font-wCLgNak(this.$path, fontBytes, this.$weight, this.$style);
/*    */                     case 1:
/*    */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */                       fontBytes = (byte[])SYNTHETIC_LOCAL_VARIABLE_1;
/*    */                       return PlatformFont_skikoKt.Font-wCLgNak(this.$path, fontBytes, this.$weight, this.$style);
/*    */                   } 
/*    */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */                 }
/*    */                 
/*    */                 @NotNull
/*    */                 public final Continuation<Unit> create(@NotNull Continuation<? super null> $completion) {
/*    */                   return (Continuation)new Function1<>(this.$resourceReader, this.$path, this.$weight, this.$style, $completion);
/*    */                 }
/*    */                 
/*    */                 @Nullable
/*    */                 public final Object invoke(@Nullable Continuation<?> p1) {
/*    */                   return ((null)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */                 }
/*    */               }(Continuation<? super Font>)this);
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super FontResources_skikoKt$Font$fontFile$3> $completion) {
/*    */       FontResources_skikoKt$Font$fontFile$3 fontResources_skikoKt$Font$fontFile$3 = new FontResources_skikoKt$Font$fontFile$3(this.$resource, this.$weight, this.$style, this.$resourceReader, $completion);
/*    */       fontResources_skikoKt$Font$fontFile$3.L$0 = value;
/*    */       return (Continuation<Unit>)fontResources_skikoKt$Font$fontFile$3;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*    */       return ((FontResources_skikoKt$Font$fontFile$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\FontResources_skikoKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */