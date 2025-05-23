/*    */ package androidx.compose.runtime.saveable;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032w\020\003\032\016\022\004\022\002H\004\022\004\022\002H\0050\001\"\004\b\000\020\004\"\b\b\001\020\005*\0020\0022.\020\006\032*\022\004\022\0020\b\022\023\022\021H\004¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\006\022\004\030\001H\0050\007¢\006\002\b\f2#\020\r\032\037\022\023\022\021H\005¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\006\022\004\030\001H\0040\016\032\030\020\017\032\016\022\004\022\002H\020\022\004\022\0020\0020\001\"\004\b\000\020\020\"\034\020\000\032\020\022\006\022\004\030\0010\002\022\004\022\0020\0020\001X\004¢\006\002\n\000¨\006\021"}, d2 = {"AutoSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "Saver", "Original", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "autoSaver", "T", "runtime-saveable"})
/*    */ public final class SaverKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <Original, Saveable> Saver<Original, Saveable> Saver(@NotNull Function2<? super SaverScope, ? super Original, ? extends Saveable> save, @NotNull Function1<? super Saveable, ? extends Original> restore) {
/* 65 */     Intrinsics.checkNotNullParameter(save, "save"); Intrinsics.checkNotNullParameter(restore, "restore"); return new SaverKt$Saver$1(save, restore); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\025\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\027\020\002\032\004\030\0018\0002\006\020\003\032\0028\001H\026¢\006\002\020\004J\033\020\005\032\004\030\0018\001*\0020\0062\006\020\003\032\0028\000H\026¢\006\002\020\007¨\006\b"}, d2 = {"androidx/compose/runtime/saveable/SaverKt$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "restore", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable"}) public static final class SaverKt$Saver$1 implements Saver<Original, Saveable> { SaverKt$Saver$1(Function2<SaverScope, Original, Saveable> $save, Function1<Saveable, Original> $restore) {} @Nullable
/* 66 */     public Saveable save(@NotNull SaverScope $this$save, Object value) { Intrinsics.checkNotNullParameter($this$save, "<this>"); return (Saveable)this.$save.invoke($this$save, value); } @Nullable
/*    */     public Original restore(@NotNull Object value) {
/* 68 */       Intrinsics.checkNotNullParameter(value, "value"); return (Original)this.$restore.invoke(value);
/*    */     } }
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
/*    */   @NotNull
/*    */   public static final <T> Saver<T, Object> autoSaver() {
/* 94 */     Intrinsics.checkNotNull(AutoSaver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>"); return (Saver)AutoSaver;
/*    */   } @NotNull
/* 96 */   private static final Saver<Object, Object> AutoSaver = Saver(SaverKt$AutoSaver$1.INSTANCE, SaverKt$AutoSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\001*\0020\0022\b\020\003\032\004\030\0010\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke"}) static final class SaverKt$AutoSaver$1 extends Lambda implements Function2<SaverScope, Object, Object> {
/* 97 */     public static final SaverKt$AutoSaver$1 INSTANCE = new SaverKt$AutoSaver$1(); SaverKt$AutoSaver$1() { super(2); } @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @Nullable Object it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); return it; } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\000\n\002\b\002\020\000\032\004\030\0010\0012\006\020\002\032\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "it", "invoke"}) static final class SaverKt$AutoSaver$2 extends Lambda implements Function1<Object, Object> { @Nullable
/* 98 */     public final Object invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); return it; }
/*    */ 
/*    */     
/*    */     public static final SaverKt$AutoSaver$2 INSTANCE = new SaverKt$AutoSaver$2();
/*    */     
/*    */     SaverKt$AutoSaver$2() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaverKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */