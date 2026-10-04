.class public final synthetic Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;->f$0:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    .line 0
    iget-object p0, p0, Lcom/example/ui/screens/MainScreenKt$$ExternalSyntheticLambda27;->f$0:Landroidx/compose/runtime/MutableState;

    invoke-static {p0, p1, p2}, Lcom/example/ui/screens/MainScreenKt;->MainScreen$lambda$15$lambda$14$lambda$12(Landroidx/compose/runtime/MutableState;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    return-void
.end method
